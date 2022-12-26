package com.NewDemo.Demo;

public class Student {
	//Constructor Injection
   public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
int id;
   String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Student [Roll No.=" + id + ", name=" + name + "]";
}

}
