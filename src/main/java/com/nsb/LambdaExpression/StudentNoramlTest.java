package com.nsb.LambdaExpression;

public class StudentNoramlTest {

	public static void main(String[] args) {

		Student student = new StudentImpl();
		student.display();
		
		Student s = ()-> System.out.println("Hello from Lambda method");
		s.display();
		
		
		Calculator c = (a,b) -> a+b;
		System.out.println(c.add(10, 20));
		
		StringLength str = s1-> s1.length();
		System.out.println(str.getLength("Nitin Gaikwad"));
		
		
	}

}
