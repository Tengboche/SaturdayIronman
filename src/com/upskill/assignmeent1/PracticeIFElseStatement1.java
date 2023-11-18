package com.upskill.assignmeent1;

public class PracticeIFElseStatement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks=90;
		
		if (marks >=90 && marks<=99){
			System.out.println("Grade A");
		}	else if (marks>=80 &&   marks<=89){
		System.out.println("Grade B");
			
		}else if (marks>=70 && marks<=79){
			System.out.println("Grade C");
			
		}else	if (marks>=60 && marks<=69){
			System.out.println("Grade D");
		}else	if (marks<=60){
			System.out.println("Fail");
			
			}else {
				System.out.println("Invalid Grade");
				
				
	}
	}

}
