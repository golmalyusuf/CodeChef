package codeChef_beginner;

import java.util.Scanner;

public class BearAndLadder {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t!=0){
			t--;
			long i = in.nextLong();
			long j = in.nextLong();
			
			if(i>j) {
				long temp = i;
				i = j;
				j = temp;
			} 
			 
			if(Math.abs(j-i) == 1) {
				if(i%2 == 1 && j%2 == 0){
					System.out.println("YES");
				}else{
					System.out.println("NO");
				}
			}else if(Math.abs(j-i) == 2) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}

}
