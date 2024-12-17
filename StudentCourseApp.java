package com.bldea.studentcoursemanagement.app;

import java.util.Scanner;

import com.bldea.studentcoursemanagement.service.StudentService;

public class StudentCourseApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select the type of user:");
		System.out.println("1. Student \n"
				+ "2. Professor\n"
				+ "3. Admin\n"
				+ "99. exit\n");
		int sel1=sc.nextInt();
		switch (sel1) {
		case 1: {
			System.out.println("Student Operation Selected");
			StudentService ss = new StudentService();
			ss.start();
			break;
		}
		case 2: {
			System.out.println("Professor Operation Selected");	
			break;
		}
		case 3: {
			System.out.println("Admin Operation Selected");
			break;
		}
		case 99: {
			System.exit(0);
		}
		default:
			System.out.println("Please make a valid choice");
			main(null);
		}
	}
}
