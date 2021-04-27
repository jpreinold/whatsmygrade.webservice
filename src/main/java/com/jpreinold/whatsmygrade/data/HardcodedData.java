package com.jpreinold.whatsmygrade.data;

import com.jpreinold.whatsmygrade.model.Assignment;
import com.jpreinold.whatsmygrade.model.Category;
import com.jpreinold.whatsmygrade.model.Course;
import com.jpreinold.whatsmygrade.model.Student;

import java.util.Arrays;
import java.util.List;

public class HardcodedData {

    private static Assignment assignment1category1Course1Student2 = Assignment.builder()
            .name("quiz1")
            .id("quiz1")
            .grade(81.7)
            .build();

    private static Category category1Course1Student2 = Category.builder()
            .name("Quizzes")
            .id("cat1")
            .weight(20)
            .assignments(Arrays.asList(assignment1category1Course1Student2))
            .build();

    private static Course course1Student2 = Course.builder()
            .name("Science")
            .categories(Arrays.asList(category1Course1Student2))
            .build();

    public static Student student2 = Student.builder()
            .name("Martha")
            .id("student2")
            .courses(Arrays.asList(course1Student2))
            .build();

    private static Assignment assignment1category1Course1Student1 = Assignment.builder()
            .name("test1")
            .id("test1")
            .grade(95.3)
            .build();

    private static Category category1Course1Student1 = Category.builder()
            .name("Tests")
            .id("cat1")
            .weight(30)
            .assignments(Arrays.asList(assignment1category1Course1Student1))
            .build();

    private static Course course1Student1 = Course.builder()
            .name("Math")
            .categories(Arrays.asList(category1Course1Student1))
            .build();

    public static Student student1 = Student.builder()
            .name("Jason")
            .id("student1")
            .courses(Arrays.asList(course1Student1))
            .build();
    public static List<Student> getStudents(){
        return Arrays.asList(student1, student2);
    }

}
