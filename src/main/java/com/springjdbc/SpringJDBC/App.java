package com.springjdbc.SpringJDBC;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbc.SpringJDBC.dao.StudentDAO;
import com.springjdbc.SpringJDBC.dao.StudentDAOImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context= new ClassPathXmlApplicationContext("com/springjdbc/SpringJDBC/config.xml");
        StudentDAO studentdao =context.getBean("studentdao",StudentDAO.class);
        
        
        //inserting student
//        Student student= new Student();
//        student.setId(222);
//        student.setName("Sonali Menaria");
//        student.setCity("Ahmedabad");
//        int rowadded=studentdao.insert(student);
//        System.out.println("no of rows added: "+rowadded );
        
        //Delete student
//        int rowsdeleted=  studentdao.remove(101);
//        System.out.println("No of rows deleted: "+rowsdeleted);
        
       // select query for single row
//        Student s1=studentdao.getStudent(111);
//        System.out.println(s1);
        
        //retriving all students
        List<Student> allStudents = studentdao.getAllStudents();
        System.out.println(allStudents);
        

    }
}
