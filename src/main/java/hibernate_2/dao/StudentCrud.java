package hibernate_2.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibernate_2.dto.Student;
import hibernate_2.dto.StudentIdentity;
import hibernate_2.dto.StudentSequence;
import hibernate_2.dto.StudentTable;

public class StudentCrud {
	EntityManager em =Persistence.createEntityManagerFactory("arvind").createEntityManager();
	EntityTransaction et = em.getTransaction();
	//auto
	public void save(Student student) {
		System.out.println(student);
		et.begin();
//		em.persist(student);
		Student db = em.merge(student);
		System.out.println(db);
		et.commit();
	}
	public void saveIdentity(StudentIdentity student) {
		System.out.println(student);
		et.begin();
//		em.persist(student);
		StudentIdentity db = em.merge(student);
		System.out.println(db);
		et.commit();
	}
	
	public void saveTable(StudentTable student) {
		System.out.println(student);
		et.begin();
//		em.persist(student);
		StudentTable db = em.merge(student);
		System.out.println(db);
		et.commit();
	}
	
	public void saveStudentSequence(StudentSequence student) {
		System.out.println(student);
		et.begin();
//		em.persist(student);
		StudentSequence db = em.merge(student);
		System.out.println(db);
		et.commit();
	}
}
