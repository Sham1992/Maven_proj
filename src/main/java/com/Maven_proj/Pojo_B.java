package com.Maven_proj;

public class Pojo_B 
{
	public static void main(String[] args) 
	{
		Pojo_A p = new Pojo_A();
		int a = p.getA();
		System.out.println("a value :"+a);
		
		p.setA(100);
		int a2 = p.getA();
		System.out.println("a2 value :"+a2);
		
	}
}
