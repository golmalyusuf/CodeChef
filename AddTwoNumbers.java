package beginner;

import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		while(t>0) {
			int i = in.nextInt();
			int j = in.nextInt();
			
			System.out.println(i+j);
			t--;
		}
	}

}
