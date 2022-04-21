package com.constructor1;

public class Ishu_Cons {
	//default constructor
public Ishu_Cons() {
System.out.println("Default Constructor");
}
//parameterized constructor
public Ishu_Cons(String name) {
	this();	
	System.out.println(name);
}
public Ishu_Cons(int age) {
	this("Raghu");
		
	System.out.println(age);
}
public Ishu_Cons(char gender) {
		this(37);
	System.out.println(gender);
}
public static void main(String[] args) throws Throwable {
	Ishu_Cons r=new Ishu_Cons('R');
	r.finalize();
}





	
}
