package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.respository.StudentRespository;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("stu")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    private Student addStudent(Student student){
        return studentService.addStudent(student);
    }

    @GetMapping("/all")
    private List<Student> getAllStu(){
        return studentService.getAllStudent();
    }

    @GetMapping("/getbyid/{id}")
    private  Student  getStuByStuID(@PathVariable("id") Integer stuID){
        return studentService.getStudentByID(stuID);
    }

    @PutMapping("/updatestu")
    private Student updateStudent(Student student){
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/del/{id}")
    private void delByID(@PathVariable("id") Integer stuID){
        studentService.deleteStudent(stuID);
    }

}
