package com.globallogic.depenI;

//creating a class with name Employee
class Employee
{
	int id;
	String name;
	
	//default constructor
	public Employee() {
		
	}
	//Constructor using fields of id,name is generated
	public Employee(int id, String name) {
	
		this.id = id;
		this.name = name;
	}
	//toString is created
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
}

public class MyDependencyInjection {

	public static void main(String args[]) {
	//class is Injected with the values which are dependecy
		//printing the object
		//If dependency(Values) are not given to class it will  return null,0
		//Employee employee =new Employee(); //no values (dependency) is given
		//className  ObjName(kuch bhi hoskta h yeh eg:apple = new className(paasing value);	
	                                  //two values are //Dependency  
		Employee employee=new Employee(1,"Aishwarya");
		//class will not work fine
		System.out.println(employee);
	}
}
//When Values or Dependecy are in the same file Eg:1,"Aishwarya"