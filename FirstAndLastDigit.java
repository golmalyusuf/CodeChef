package codeChef_beginner;

import java.util.Scanner;

public class FirstAndLastDigit {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		
		while(t-- > 0) {
			int i = in.nextInt();
			int sum = 0;
			boolean ifTrue = true;
			while(i>0) {
				int a = i % 10;
				i /=10;
				
				if(ifTrue || i == 0) {
					sum += a;
				}
				ifTrue = false;
			}
			
			System.out.println(sum);
		}
	}

}
