package com.nt.service;

import java.util.List;

import com.nt.dto.StudentDTO;

public interface StudentService {
   public List<StudentDTO>  fetchStudents();
   public  StudentDTO  fetchStudentBySno(int sno);
   public  String  modifyStudentBySno(StudentDTO dto);
   public  String removeStudentBySno(int sno);
}
