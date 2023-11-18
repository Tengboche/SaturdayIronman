package com.upskill.java_1;

public class MethodType {
	
	/* Types of Methods
	 1. Void mMethod
	  2 Static Method
	  3. Return type Method
	  
	 */
	
	public static int hourlyincome=65;
	
	
	public static void main(String[] args) {
		
		MethodType obj = new MethodType();  //className objName = new ClassName();
		obj.annualIncomeVoid();
		System.out.println("My monthly income = " + obj.monthlyIncomeReturn());
		weeklyIncomeStatic();
	}
		//void method
		public void annualIncomeVoid(){
			int calculateAnnualIncome= hourlyincome*2000;
					System.out.println("My annual Income = " +calculateAnnualIncome);
		}
		// TODO Auto-generated method stub

	

//return type method
public int monthlyIncomeReturn(){
	int calculateMonthlyIncome= hourlyincome * 180;
	return calculateMonthlyIncome;
		
}
		//static Method
		public static void weeklyIncomeStatic(){
		int calculateWeeklyIncome = hourlyincome  * 40;
		System.out.println("My weekly Income = "+ calculateWeeklyIncome);
		
	}
	
}
	



