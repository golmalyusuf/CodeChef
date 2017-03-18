package beginner;

import java.util.Scanner;

public class PackagingCupcakes {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		
		while(t > 0) {
			long n = in.nextLong();
			n = n/2+1;
			
			System.out.println(n);
			t--;
		}
	}

}
