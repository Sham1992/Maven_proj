package com.Pojo;

public class B 
{
	public static void main(String[] args) 
	{
		A a = new A();
				
		int age = a.getAge();
		System.out.println("Age :"+age);
		
		a.setAge(25);
		
		System.out.println("After Setting");
		int value = a.getAge();
		System.out.println("Age :"+value);
		
		
		
	}
}
