package com.springjdbc.SpringJDBC.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.SpringJDBC.Student;

public class StudentDAOImpl implements StudentDAO{
	
	JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public StudentDAOImpl(JdbcTemplate template) {
		super();
		this.template = template;
	}

	public StudentDAOImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int insert(Student student) {
		// TODO Auto-generated method stub
		String insert="insert into student(id,name,city) values(?,?,?)";
		int r = template.update(insert,student.getId(),student.getName(),student.getCity());
		return r;
		
		
	}

	public int change(Student student) {
		
		// TODO Auto-generated method stub
		
		String query="update student set name=?,city=? where id=?";
		int i = template.update(query,student.getName(),student.getCity(),student.getId());
		
		
		return i;
		
		
		
	}

	public int remove(int id) {
		// TODO Auto-generated method stub
		String query="delete from student where id=?";
		int i = template.update(query,id);
		return i;
	}

	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		String query="select * from student where id=?";
		RowMapper<Student> mapper = new RowMapperImpl();
		Student studentObject = this.template.queryForObject(query, mapper,id);
		return studentObject;
	}

	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		String query="select * from student";
		List<Student> students = this.template.query(query,new RowMapperImpl());
		
		return students;
	}

}
