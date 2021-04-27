package com.jpreinold.whatsmygrade.resource;

import com.jpreinold.whatsmygrade.exception.StudentNotFoundException;
import com.jpreinold.whatsmygrade.model.Student;
import com.jpreinold.whatsmygrade.orchestrator.WhatsMyGradeOrchestrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WhatsMyGradeResource {

    @Autowired
    private WhatsMyGradeOrchestrator orchestrator;

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getStudents() {
        List<Student> students = orchestrator.retrieveStudents();
        return new ResponseEntity<List<Student>>(students, HttpStatus.OK);
    }

    @GetMapping("/students/{id}")
    public ResponseEntity getStudent(@PathVariable String id) throws StudentNotFoundException {
        Student student;
        try {
            student = orchestrator.retrieveStudent((id));
        } catch (StudentNotFoundException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity(student, HttpStatus.OK);
    }

    @PostMapping("/students")
    public ResponseEntity addStudent(@RequestBody Student student) {
        orchestrator.createStudent(student);
        return new ResponseEntity(student, HttpStatus.OK);
    }

}
