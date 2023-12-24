package com.cdac_PROJECT.Project_STudy;

import java.util.List;

public class bean1 {
	private int studentId;
	private String studentName;
	private String studentAddress;
	
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		System.out.println("setting StudentId");
		this.studentId = studentId;
	}

	public String getStudentName() {
		System.out.println("getStudentName");
		return studentName;
	}

	public void setStudentName(String studentName) {
		System.out.println("setting setStudentName");
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		System.out.println("getStudentAddress");

		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		System.out.println("setting setStudentAddress");
		this.studentAddress = studentAddress;
	}

	public bean1(int studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}

	public bean1() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "bean1 [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}

}
