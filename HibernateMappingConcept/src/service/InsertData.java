package service;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import mapping.TeacherDetails;
import mapping.Teacherr;

public class InsertData {

	public static void main(String[] args) {
		System.out.println("Connecting to database");
		SessionFactory factory = null;
		Session session = null;
		
		factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Teacherr.class)
				.addAnnotatedClass(TeacherDetails.class)
				.buildSessionFactory();
		System.out.println("Database Created");
		
		//create session
		session = factory.getCurrentSession();
		
		try {
			//creating the object
			Teacherr tempTeacher = new Teacherr("Harshit","Choudhary","harshit.c@gl.com");
			
			TeacherDetails tempTeacherDetails = new TeacherDetails("Grurgram","ReadingBooks");
			
			//associate the objects
			tempTeacher.setTeacherDetails(tempTeacherDetails);
			
			//start transaction
			session.beginTransaction();
			
			//save the teacher
			session.save(tempTeacher);
			
			//commited the transaction
			session.getTransaction().commit();
			
		}
		catch(Exception e) {
			System.out.println("error" + e.getMessage());
		}
		finally {
			session.close();
			factory.close();
		}
		
		

	}

}
