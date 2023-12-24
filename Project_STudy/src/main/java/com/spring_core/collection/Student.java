package com.spring_core.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	private String name;
	private List<String> phones;
	private Set<String> add;
	private Map<String, String> course;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	public Set<String> getAdd() {
		return add;
	}

	public void setAdd(Set<String> add) {
		this.add = add;
	}

	public Map<String, String> getCourse() {
		return course;
	}

	public void setCourse(Map<String, String> course) {
		this.course = course;
	}

	public Student(String name, List<String> phones, Set<String> add, Map<String, String> course) {
		super();
		this.name = name;
		this.phones = phones;
		this.add = add;
		this.course = course;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", phones=" + phones + ", add=" + add + ", course=" + course + "]";
	}

}
