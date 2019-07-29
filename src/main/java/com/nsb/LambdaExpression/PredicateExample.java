package com.nsb.LambdaExpression;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {

		/* 
		 * Normal way to implements predicate functional interface
		 */
		Predicate<Integer> p = (I)->{
			if(I>10){
				return true;
			}else{
				return false;
			}
		};
		
		/*
		 * More cosine way to implement predicate
		 */
		
		Predicate<Integer> p1 = J->J>10;
				
		System.out.println(p.test(1));
		System.out.println(p1.test(100));
		
		}
	
		

}
