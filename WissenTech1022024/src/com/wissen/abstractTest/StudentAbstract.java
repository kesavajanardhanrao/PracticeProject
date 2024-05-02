package com.wissen.abstractTest;

public abstract class StudentAbstract {
	
	public String studentName="RanGopalVarma";
	public String studentAddres;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddres() {
		return studentAddres;
	}
	public void setStudentAddres(String studentAddres) {
		this.studentAddres = studentAddres;
	}
	public abstract void studentId();
	
	public void studentUniform() {
		String shirtColor="Blue";
		String panColor= "Black";
	}
	
	

}
