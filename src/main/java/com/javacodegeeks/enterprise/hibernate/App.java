package com.javacodegeeks.enterprise.hibernate;

import org.hibernate.Query;
import org.hibernate.Session;

import com.javacodegeeks.enterprise.hibernate.utils.HibernateUtil;
 
public class App 
{
    public static void main( String[] args ) {
    	
        Session session = HibernateUtil.getSessionFactory().openSession();
         
       //test insert
        System.out.println("*** Test insert ***");
        
        session.beginTransaction();
        Student student = new Student();
 
        student.setStudentName("JavaFun");
        student.setStudentAge("19");
 
        session.saveOrUpdate(student);
        session.getTransaction().commit();
        
      //test update
        System.out.println("*** Test Update ***");
        
        session.beginTransaction();
        Query query = session.createQuery("from Student where studentId = 58");
        Student studentToUpdate = (Student)query.list().get(0);
        studentToUpdate.setStudentName("Lakis");
    	session.saveOrUpdate(studentToUpdate);
        session.getTransaction().commit();
        
      //test delete
        System.out.println("*** Test Delete ***");
        session.beginTransaction();
        session.delete(studentToUpdate);
        session.getTransaction().commit();
  
    }
}