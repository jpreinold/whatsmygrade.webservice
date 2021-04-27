package com.jpreinold.whatsmygrade.orchestrator;

import com.jpreinold.whatsmygrade.data.HardcodedData;
import com.jpreinold.whatsmygrade.exception.StudentNotFoundException;
import com.jpreinold.whatsmygrade.model.Student;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class WhatsMyGradeOrchestrator {

    public List<Student> retrieveStudents() {
        return Arrays.asList(HardcodedData.student1, HardcodedData.student2);
    }

    public Student retrieveStudent(String id) throws StudentNotFoundException {
        for (Student student : HardcodedData.getStudents()) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        throw new StudentNotFoundException("Could not find student with id: " + id);
    }

    public void createStudent(Student student) {
        System.out.println("Student successfully created: " + student.toString());
    }
}
