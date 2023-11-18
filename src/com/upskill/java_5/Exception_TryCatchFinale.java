package com.upskill.java_5;

public class Exception_TryCatchFinale {
	
	
	
	
	
	
	
	
	
	
	
	/*Java Exceptions - Use "try - catch - finally"

	A. Built-in Exceptions - Built-in exception throws by java which explain certain error situations


	ArithmeticException - error has occurred in an arithmetic operation.

	ArrayIndexOutOfBoundsException -  an array has been accessed with illegal index.

	ClassNotFoundException - try to access a class whose definition is not found

	FileNotFoundException - a file is not accessible or does not open.

	IOException - input-output operation failed or interrupted

	InterruptedException  - thread is waiting, sleeping, or doing some processing, and it is interrupted.

	NoSuchFieldException - class does not contain the field or variable specified

	NoSuchMethodException - accessing a method which is not found

	NullPointerException - referring to the members of a null object

	NumberFormatException  -  a method could not convert a string into a numeric format

	RuntimeException - any exception which occurs during runtime.

	StringIndexOutOfBoundsException -  String class methods to indicate that an index is either negative or greater than the size of the string


	B. User-Defined Exceptions - User can also create exception where the error situations is not covered by java*
	//
	
	 */




	public static void main(String[] args) {
		
		try{
		
		int []ageIronman = new int [] {25 , 35, 28, 32, 30, 38};
		System.out.println("Student age = " + ageIronman[0]);
	} catch (Exception e){
	e.printStackTrace();
	System.out.println("Test Execution Continue...");
	
	}
		try{
			int num = Integer. parseInt("Five");
		}catch (NumberFormatException e){
			e.printStackTrace();
			System.out.println("Test Execution Continue...");
		}
		finally {
			System.out.println("Test Execution Completed !");
		}
	}

}