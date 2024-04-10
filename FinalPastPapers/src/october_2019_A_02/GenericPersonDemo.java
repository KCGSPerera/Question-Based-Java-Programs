package october_2019_A_02;

// Completed.

import java.util.ArrayList;

interface IPerson{
	
	public String displayDetails();
}

class Student implements IPerson{
	
	String studentID;
	int grade;
	
	public Student(String studentID, int grade) {
		super();
		this.studentID = studentID;
		this.grade = grade;
	}
	
	public String displayDetails() {
		return "Student = " + this.studentID + ", Grade = " + this.grade;
		
	}
}

class Lecturer implements IPerson{
	String employeeID;
	String department;
	
	public Lecturer(String employeeID, String department) {
		super();
		this.employeeID = employeeID;
		this.department = department;
	}
	
	public String displayDetails() {
		return "Lecturer = " + this.employeeID + ", Department = " + this.department;
		
	}
}

class GenericPerson <T extends IPerson>{
	
	ArrayList<T> list = new ArrayList<>();
	
	/*
	public GenericPerson(ArrayList<T> list) {
		super();
		this.list = list;
	}
	*/
	public void displayElements(ArrayList<T> list) {
		
		for (T t : list) {
			System.out.println(t.displayDetails());
			
			
		}
		System.out.println();
	}
	
}

public class GenericPersonDemo {

	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("STD1111", 6));
		students.add(new Student("STD2222", 7));
		students.add(new Student("STD3333", 12));
		students.add(new Student("STD4444", 11));
		students.add(new Student("STD5555", 10));

		ArrayList<Lecturer> lecturers = new ArrayList<>();
		lecturers.add(new Lecturer("EMP0000", "IT"));
		lecturers.add(new Lecturer("EMP1111", "SE"));
		lecturers.add(new Lecturer("EMP2222", "CSN"));
		lecturers.add(new Lecturer("EMP3333", "EE"));
		lecturers.add(new Lecturer("EMP4444", "IS"));
		
		GenericPerson genericPerson = new GenericPerson();	
		genericPerson.displayElements(students);
		genericPerson.displayElements(lecturers);

	}

}
