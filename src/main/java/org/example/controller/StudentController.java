package org.example.controller;

import org.example.StudentEntity;
import org.example.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public StudentEntity saveStudent(@RequestBody StudentEntity student) {
        return studentService.saveStudent(student);
    }

    @GetMapping
    public List<StudentEntity> getAllStudents() {
        return studentService.getAllStudents();
    }
}