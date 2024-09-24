package com.shreyaluv2code.cruddemo;

import com.shreyaluv2code.cruddemo.dao.StudentDAO;
import com.shreyaluv2code.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}
   @Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner ->{
			// createStudent(studentDAO);

			 createMultipleStudent(studentDAO);

			// readStudent(studentDAO);

			// queryForStudents(studentDAO);

			// queryForStudentsByLastName(studentDAO);

			// updateStudent(studentDAO);

			// deleteStudent(studentDAO);

			// deleteAllStudents(studentDAO);
		};
   }

	private void deleteAllStudents(StudentDAO studentDAO) {

		System.out.println("Deleting all students");
		int numRowsDeleted = studentDAO.deleteAll();
		System.out.println("Delete row count: "+numRowsDeleted);
	}

	private void deleteStudent(StudentDAO studentDAO) {

		int studentId=4;
		System.out.println("Deleting student id: " + studentId);
		studentDAO.delete(studentId);
	}

	private void updateStudent(StudentDAO studentDAO) {

		// retrieve student based on the id: primary key
		 int studentId =1;
		System.out.println("Getting student with id: "+studentId);
		Student myStudent =studentDAO.findById(studentId);

		// change first name to "shreya"
		System.out.println("Updating student ...");
		myStudent.setFirstName("shreya");

		// update the student
		studentDAO.update(myStudent);

		// display the updated student
		System.out.println("Updated student: "+ myStudent);
	}

	private void queryForStudentsByLastName(StudentDAO studentDAO) {

		// get a list of students
		List<Student> theStudents = studentDAO.findByLastName("kore");

		// display list of students
		for (Student tempStudent : theStudents){
			System.out.println(tempStudent);
		}
	}

	private void queryForStudents(StudentDAO studentDAO) {
		// get a list of students
		List<Student> theStudents = studentDAO.findAll();

		// display list of students
		for (Student tempStudent : theStudents) {
			System.out.println(tempStudent);
		}
	}

	private void readStudent(StudentDAO studentDAO) {
		// create a student object
		System.out.println("Creating new student object...");
		Student tempStudent=new Student("chinu","kore","2022bcs050@sggs.ac.in");

		// save the student
		System.out.println("Saving the student...");
		studentDAO.save(tempStudent);

		// display id of the saved student
		int theId = tempStudent.getId();
		System.out.println("saved student. Generated id: "+theId);

		// retrieve student based on the id: primary key
		System.out.println("Retrieving student with id: "+theId);
		Student myStudent=studentDAO.findById(theId);

		// display student
		System.out.println("Found the student: "+ myStudent);
	}

	private void createMultipleStudent(StudentDAO studentDAO) {
		// create multiple students
		System.out.println("Creating 3 student object...");
		Student tempStudent1=new Student("shreya","kore","2022bcs010@sggs.ac.in");
		Student tempStudent2=new Student("parth","kore","2022bcs000@sggs.ac.in");
		Student tempStudent3=new Student("sunil","kore","2022bcs110@sggs.ac.in");

		// save the student objects
		System.out.println("Saving the student...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);

	}

	private void createStudent(StudentDAO studentDAO) {

		// create the student object
		System.out.println("Creating new student object...");
		Student tempStudent=new Student("shreya","kore","2022bcs010@sggs.ac.in");

		// save the student object
		System.out.println("Saving the student...");
		studentDAO.save(tempStudent);

		// display id of the saved student
		System.out.println("Saved student. Generated id: "+ tempStudent.getId());
	}

}