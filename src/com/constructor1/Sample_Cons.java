package com.constructor1;

public class Sample_Cons {
	public Sample_Cons() {
		// TODO Auto-generated constructor stub
	System.out.println("default");
	}
	public Sample_Cons(int a) {
		this();
	System.out.println(a);
	}
	public Sample_Cons(String b ) {
		this(5);
	System.out.println(b);
	}
	public Sample_Cons(char c) {
		this("Ishu");
		
	System.out.println(c);
	}
	public static void main(String[] args) throws Throwable {
		Sample_Cons ishu=new Sample_Cons('T');
		ishu.finalize();
	}

}
