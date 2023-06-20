package com.springjdbc.SpringJDBC.dao;

import java.util.List;

import com.springjdbc.SpringJDBC.Student;

public interface StudentDAO {

	public int insert(Student student);

	public int change(Student student);

	public int remove(int id);

	public Student getStudent(int id);

	public List<Student> getAllStudents();

}
