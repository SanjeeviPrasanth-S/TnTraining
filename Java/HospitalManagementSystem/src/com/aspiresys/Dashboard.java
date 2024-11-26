package com.aspiresys;

import java.util.ArrayList;
import java.util.Scanner;

public class Dashboard {
	static ArrayList<Patient> patientList = new ArrayList<Patient>();

	// Add patients
	public static void addPatient(Scanner scanner) {
		Patient patient = new Patient();
		System.out.print("Enter patient's name: ");
		patient.setPatientName(scanner.next());
		System.out.print("Enter patient's age: ");
		patient.setPatientage(scanner.nextInt());
		System.out.print("Enter patient's illness: ");
		patient.setIllness(scanner.next());
		patientList.add(patient);
		System.out.println("Patient added successfully!");
	}
	 // Method to view all patients
    public static void viewPatients() {
        if (patientList.isEmpty()) {
            System.out.println("No patients in the system.");
        } else {
            System.out.println("\nList of Patients:");
            for (Patient patient : patientList) {
                System.out.println(patient);
            }
        }
    }
 // Method to search for a patient by ID
    public static void searchPatientById(Scanner scanner) {
        System.out.print("Enter Patient name to search: ");
       String name=scanner.next();
 
        for (Patient patient : patientList) {
            if (patient.getPatientName().equals(name)) {
                System.out.println("Patient found: " + patient);
                return;
            }
        }
        System.out.println("No patient found with name: " + name);
    }
}

