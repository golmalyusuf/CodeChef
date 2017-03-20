package codeChef_beginner;

import java.util.Scanner;

public class ReverseTheNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		
		while(t-- > 0) {
			int i = in.nextInt();
			int m = 0;
			
			while(i > 0) {
				int a = i%10;
				m = m * 10 + a;
				i /= 10;
				 
			}
			
			System.out.println(m);
		}
	}

}
