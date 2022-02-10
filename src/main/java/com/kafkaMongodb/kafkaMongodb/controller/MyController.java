package com.kafkaMongodb.kafkaMongodb.controller;


import com.kafkaMongodb.kafkaMongodb.model.Student;
import com.kafkaMongodb.kafkaMongodb.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class MyController {
    @Autowired
    private StudentRepository studentRepository;
    @PostMapping("/save")
    public ResponseEntity<?> addStudent(@RequestBody Student student)
    {
        Student save=studentRepository.save(student);
        return ResponseEntity.ok(save);
    }

    @GetMapping("/")
    public ResponseEntity<?> getStudent()
    {

        return ResponseEntity.ok(this.studentRepository.findAll());
    }
}
