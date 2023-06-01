package com.generation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student {
    private String name;
    private String id;
    private int age;
    public final List<Course> courseList = new ArrayList<>();

    public Student( String name, String id, int age){
        this.name = name;
        this.id = id;
        this.age = age;
    }//constructor
    
    

	public String getName() {
		return name;
	}//get nombre



	public void setName(String name) {
		this.name = name;
	}//set nombre



	public String getId() {
		return id;
	}//get id



	public void setId(String id) {
		this.id = id;
	}//set id



	public int getAge() {
		return age;
	}//get Age



	public void setAge(int age) {
		this.age = age;
	}//set age



	public List<Course> getCourseList() {
		return courseList;
	}//get Course



	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", age=" + age + ", courseList=" + courseList + "]";
	}//to string
    
}//class student