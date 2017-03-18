package beginner;

import java.util.Scanner;

public class SumOfDigits {
	
	public static void main(String[] args) {
		try{
			Scanner in = new Scanner(System.in);
			int t = in.nextInt();
		
			while(t>0) {
				long i = in.nextInt();
				long a = 0;
				long sum = 0;
				
				while(i>0) {
					a = i % 10;
					i = i /10; 
					sum += a;
				}
				System.out.println(sum);
			}
		}catch(Exception e){}	
	}
}
