package com.tnsif.dayeight.finalkey;

public class FinalVariable {

 final int speedlimit=90;
	
	void run() {
		speedlimit=125;
		System.out.println("Running safely with " + speedlimit +" kmph");
	}
	
	public static void main(String[] args) {
		
		FinalVariable obj = new FinalVariable();
		obj.run();
		
	}
	
}
