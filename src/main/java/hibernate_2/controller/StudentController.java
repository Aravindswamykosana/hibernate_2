package hibernate_2.controller;

import javax.persistence.Persistence;

import hibernate_2.dao.StudentCrud;
import hibernate_2.dto.Student;
import hibernate_2.dto.StudentIdentity;
import hibernate_2.dto.StudentSequence;
import hibernate_2.dto.StudentTable;

public class StudentController {
	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("arvind");
		StudentCrud crud=new StudentCrud();
		//crud.save(new Student(0,"arvind","a@gmail.com","a123",8388868719l,"kakinada"));
		//crud.saveIdentity(new StudentIdentity(0,"arvind","a@gmail.com","a123",8388868719l,"kakinada"));
	
		//crud.saveTable(new StudentTable(0,"arvind","a@gmail.com","a123",8388868719l,"kakinada"));
		crud.saveStudentSequence(new StudentSequence(0,"arvind","a@gmail.com","a123",8388868719l,"kakinada"));
	}
}