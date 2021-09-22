package com.Vinsys;

public class Asseinment {

	static String str = "Hello";
	float s = 10.5f;
	public int x =20;
	private String str2="Word";
	
	
	
	public static void main(String[] args) {
		System.out.println(str);
		Asseinment as =new Asseinment();
		as.display();
		as.display2();
		as.display3();
		

	}
	
	
	void display(){
	System.out.println(x);
	
}
	
	void display2() {
		System.out.println(s);
	}	
	
	void display3() {
		System.out.println(str2);
	}	
	
}