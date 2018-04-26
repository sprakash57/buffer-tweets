package com.employee.crud;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.employee.entity.Employee;

public class ReadEmployee {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Employee.class)
									.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		try {
			
			session.beginTransaction();
			List<Employee> theEmployee = session.createQuery("from Employee").getResultList();
			
			for(Employee temp:theEmployee) {
				System.out.println(temp);
			}
			
			session.getTransaction().commit();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			factory.close();
		}
	}

}
