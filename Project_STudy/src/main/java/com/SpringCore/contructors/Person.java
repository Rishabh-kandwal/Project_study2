package com.SpringCore.contructors;

public class Person 
{
	private String name;
	private int personid;
	private certi  c;
	
	@Override
	public String toString() {
		return
"Person [name=" + this.name + ", personid=" + this.personid +"certi"+this.c.name+ "]";
	}
	public Person(String name, int personid,certi c) {
		this.c=c;
		this.name = name;
		this.personid = personid;
	}
	
}
