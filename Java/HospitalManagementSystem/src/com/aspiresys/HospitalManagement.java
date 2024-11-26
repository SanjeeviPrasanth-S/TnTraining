package com.aspiresys;

import java.util.ArrayList;
import java.util.Scanner;

public class HospitalManagement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean entry=true;
       while(entry) {
		System.out.println("\nWelcome to Hospital");
		System.out.println("1.Add patient\n2.View all patients\n3.search Patient by id\n4.Exit");
		System.out.println("Enter the choice");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			Dashboard.addPatient(scanner);
			break;
		case 2:
			Dashboard.viewPatients();
			break;
		case 3:
			Dashboard.searchPatientById(scanner);
			break;
		case 4:
			System.out.println("ThankYou For using the Application");
			entry=false;
			break;
		default: System.out.println("Invalid choice");

		}
       }
	}
}
