package com.employee.crud;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.employee.entity.Employee;

public class CreateEmployee {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Employee.class)
									.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		try {
			
			String dobStr = "15/01/1993";
			Date theDob = DateUtils.parseDate(dobStr);
			
			Employee emp = new Employee("Sunny","Prakash","Cognizant",theDob);
			session.beginTransaction();
			session.save(emp);
			session.getTransaction().commit();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			factory.close();
		}

	}

}
