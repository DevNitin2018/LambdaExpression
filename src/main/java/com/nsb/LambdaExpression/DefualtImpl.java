package com.nsb.LambdaExpression;

public class DefualtImpl implements InterfaceWithDefualtMethod {

	public static void main(String[] args) {

		DefualtImpl defualtImpl = new DefualtImpl();
		defualtImpl.show();

	}
 
	@Override
	public void show(){
		System.out.println("My Class method");
	}
	
	
}
