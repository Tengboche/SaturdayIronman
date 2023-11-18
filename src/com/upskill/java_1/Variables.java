package com.upskill.java_1;

public class Variables {
	
	
	// variables in Java
	
	   //Instance OR global variable  - Variables declared in Class Level, outside method
	
	   // Local variable  - variables declared in methods
	   
	  //  Static variable - variables belong to class and don't required object
	 
	 // Method parameter - variables used as method parameter
	
	public String  country ="USA";   //Instance or global variable 
	
	public static String region = "North America";
	
			

	public static  void main(String[] args) {
		
		String City ="New YOrk";
		String Police = "NYPD"; 
		System.out.println(City);
		System.out.println(region);
		
		pa("Banselam");
		Variables obj = new Variables();
		System.out.println(obj.country);
		
				

		    

		
		
		
	}
	
	public static void nj(String county){
		String city = "Bloomfield";
		String police= "BPD";
		
		System.out.println(city);
		System.out.println(region);
		System.out.println(county);
		   
	
	}
	public static void pa(String county){
		
		String city = "Philli";
		String police ="PPD";
		
		System.out.println(city);
		System.out.println(region);
		System.out.println(county);
		   
		
		// TODO Auto-generated method stub

	}

}
