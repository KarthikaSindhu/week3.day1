package org.student;

import org.college.College;
import org.department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("Student Name is KARTHIKA SINDHU");
	}

	public void studentDept() {
		System.out.println("She Belongs to Computer Science Dept");
	}

	public void studentId() {
		System.out.println("ID number is 5045612");
	}

	public static void main(String[] args) {

		Student S1 = new Student();
		Department D1 = new Department();
		College C1 = new College();
		System.out.println("**Student Methods**");
		S1.studentName();
		S1.studentDept();
		S1.studentId();
		
		System.out.println("***Department Methods***");
		D1.deptName();
		
		System.out.println("*College Methods*");
		C1.collegeCode();
		C1.collegeName();
		C1.collegeRank();
	}

}
