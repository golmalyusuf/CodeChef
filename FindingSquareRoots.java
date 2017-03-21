package codeChef_beginner;

import java.util.Scanner;

public class FindingSquareRoots {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		
		while(t-- > 0){
			int i = in.nextInt();
			i = (int) Math.sqrt(i);
			System.out.println(i);
		}
	}

}
