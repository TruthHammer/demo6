package com.example.demo.respository;

import com.example.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRespository extends JpaRepository<Student,Integer> {


}
