package javapractice1.wk7;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String msg = null;
		
		do {
			System.out.print("Say something: ");
			msg = scan.next();
			if(msg.equalsIgnoreCase("hello")) {
				System.out.println("Hi there: ");
			} else {
				System.out.println("You said: " + msg);
			}
		} while(!msg.equalsIgnoreCase("bye"));
		
		System.out.println("Program terminated.");
	}
}
