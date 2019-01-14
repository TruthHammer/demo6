package com.example.demo.serviceImpl;

import com.example.demo.entity.Student;
import com.example.demo.respository.StudentRespository;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService  {
    @Autowired
    private StudentRespository studentRespository;
    @Override
    public Student addStudent(Student student) {
        return studentRespository.save(student);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRespository.findAll();
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRespository.save(student);
    }

    @Override
    public void deleteStudent(Integer stuID) {
        studentRespository.deleteById(stuID);
    }

    @Override
    public Student getStudentByID(Integer stuID) {
        return studentRespository.findById(stuID).get();
    }
}
