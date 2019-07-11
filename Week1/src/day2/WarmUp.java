package day2;

import java.util.Scanner;

public class WarmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sncr = new Scanner(System.in);
		
		System.out.println("What is your name?");
		sncr.next();//string
		
		 
		System.out.println("How old are you?");
		sncr.nextInt();//numbers 
		System.out.println("What is your favorite color?");
		sncr.next();//string
        System.out.println("What is your best number?");
		sncr.nextInt();//numbers
		
		
			
System.out.println("Thank you for your participation!");

sncr.close();
	}

}

