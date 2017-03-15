package codeChef_beginner;

import java.util.Scanner;

public class FactorialFCTRL {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		/*int t = in.nextInt();
		while(t>0){
			int count = 0;
			int input = in.nextInt();
			while(input > 5){
				count += input/5;
				input /= 5;
			}
			t--;
			System.out.println(count);
		}*/
		
		int count = in.nextInt();
        for (int i = 0; i < count; i++) {
            int n = in.nextInt();
            int result = 0;
            for (int d = 5; d <= n; d *= 5) {
                result += n / d;
            }
            System.out.println(result);
        }
	}
}
