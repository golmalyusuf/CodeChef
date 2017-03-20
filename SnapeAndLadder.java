package codeChef_beginner;

import java.util.Scanner;

public class SnapeAndLadder {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		
		while(t > 0){
			int b = in.nextInt();
			int ls = in.nextInt();
			
			if(b<ls){
				int temp = b;
				b = ls;
				ls = temp;
			}
			
			double min = Math.sqrt(b*b - ls * ls);
			double max = Math.sqrt(b*b + ls * ls);
			
			System.out.println(min +" "+max);
			t--;
		}
	}

}
