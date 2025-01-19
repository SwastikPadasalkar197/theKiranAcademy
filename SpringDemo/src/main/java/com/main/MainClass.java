package com.main;
import com.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
	    Student s= context.getBean("std",Student.class);
	    System.out.println(s);
	    
	    //Country c= context.getBean("c",Country.class);
	    //System.out.println(c);
	}

}
