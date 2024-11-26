package com.aspiresys;

public class Patient {
	int patientage;
	String patientName;
	String illness;

	public String getIllness() {
		return illness;
	}

	public void setIllness(String illness) {
		this.illness = illness;
	}

	public int getPatientage() {
		return patientage;
	}

	public void setPatientage(int patientage) {
		this.patientage = patientage;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	@Override
	public String toString() {
		return "patientName=" + patientName + ", patientage=" + patientage + ", illness=" + illness;
	}

}
