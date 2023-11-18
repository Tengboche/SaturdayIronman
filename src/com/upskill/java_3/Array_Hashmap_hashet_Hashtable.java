package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_hashet_Hashtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age=25;                               // Variable
		int[] ageIronman = new int [] { 25, 32, 37, 21, 27, 32};          
		
		// Array index            [0] [1] [2] [3] [4] [5]
		
		System.out.println ("Student Age :  "+ ageIronman[4]);
		
		System.out.println ("Total Student :  "+ ageIronman.length);
		

 String[] nameIronman= new String[]{ " yusuf", " Abdulah", "Madan", "Sumaia", " Jannatul"};

System.out.println ("Student Name :  "+ nameIronman[2]);
System.out.println ("Total student Name :  "+ nameIronman.length);

// Multi-dimentional array

      int[][] ageIronman2D = {{ 25, 32, 37, 21, 27, 32},                    // [0][0] [0][1] [0][2] [0][3] [0][4] [0][5]
    		  {26, 30, 33, 28}};                                            // [1][0] [1][1]  [1][2] [1][3]
      
      System.out.println  ("Student Age 2D :  "+ ageIronman2D [1][0]);
      
		
	
	// Hashmap store multiple data using key -value pair, Implementation of Map interface

	HashMap<String, Integer> Student = new HashMap<String, Integer>();
	 Student.put ("yusuf",28);
	 Student.put ("Abdulah",22);
	 Student.put ("Madan",32);
	 Student.put ("Jannatul",24);
	 Student.put ("fahim",28);
	 
	  System.out.println("HashMap Student Age : " + Student.get ("Madan"));
	  
	  // HashMaps store multiple data using key- value pair, implementation of map interface
	 HashMap<String,String > Capital = new HashMap <String,String>();
	  Capital.put("NP" ," Kathmandu");
	  System.out.println("Capital City : " + Capital.get ("NP"));
	  
	  HashSet<String> car = new HashSet <String>();
      car.add ("Tata");
      car.add ("Toyota");
      car.add ("Tesla");
      car.add ("Audi");
      System.out.println("Car : " + car);
     
      // HashTable store multiple data key - value pair, No duplicate,
      // also is synchronized (only one thread can be modified)
      Hashtable<String, String> Region = new    Hashtable<String, String>();
      Region.put("BD", "ASIA");
      Region.put("USA", "America");
      
      System.out.println("Region: " + Region.get ("BD"));
      
      
	  		
	  
	
	}
}
