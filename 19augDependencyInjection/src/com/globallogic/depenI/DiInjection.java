package com.globallogic.depenI;  //Package Name

//Class for student
class Student{
	
	int age;
	String teacher;
	
	//Default Constructor
	public Student() {
		
	}

	//Constructor using field and id
	public Student(int age, String teacher) {
		super();
		this.age = age;
		this.teacher = teacher;
	}
	
	//To String
	@Override
	public String toString() {
		return "Student [age=" + age + ", teacher=" + teacher + "]";
	}

}

//The original class>>DiInjection
public class DiInjection {
          //main 
	public static void main (String args[]) {
		
//>>1>>With passing No Value >> OnConsole>> Student[age=0,teacher=null]
		Student stu=new Student();
//ClassNmae ObjName=new ClassName();
		System.out.println(stu);
	}
}
