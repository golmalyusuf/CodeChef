package codeChef_beginner;

import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int withdraw = in.nextInt();
		double totalAmount = in.nextDouble();
		
		if(withdraw%5 == 0 && totalAmount > withdraw+0.50){
			totalAmount -= withdraw;
			totalAmount -= 0.50;
		}
		
		System.out.println(totalAmount);
	}
}
