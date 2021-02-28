package com.vikash.redis.redisdemo.controller;

import com.vikash.redis.redisdemo.model.Student;
import com.vikash.redis.redisdemo.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/save")
    public String addStudent(){

        try {
            Student student = new Student("Eng2015001", "John Doe", Student.Gender.MALE, 1);
            studentRepository.save(student);

            System.out.println(studentRepository.findById("Eng2015001").get().getName());
        }catch (Exception e){
            return "Fail";
        }
        return "Success";
    }
}
