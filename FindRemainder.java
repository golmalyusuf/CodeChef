package beginner;

import java.util.Scanner;

public class FindRemainder {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		while(t-->0){
			int a = in.nextInt();
			int b = in.nextInt();
			int ans = 0;
			if(b > 0){
				ans =   (int)Math.ceil(a%b);
			} else ans = a;
			
			System.out.println(ans);
		}
	}

}
