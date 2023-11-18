package com.upskill.java_5;

public class AbstractClassImplementation extends AbstractClass{

	@Override
	public void iDoor() {
		System.out.println("My Car has 4 doors");
		
	}

	@Override
	public String iEngine() {
		System.out.println("My Car has dual motor engine");
		return " Dual Motor";
	}

	@Override
	public void iColor() {
		System.out.println("My Car RED");
		
	}

	@Override
	public int iWheel() {
		System.out.println("My Car has 4 wheels");
		return 4;
	}

}
