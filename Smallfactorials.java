package codeChef_beginner;

import java.math.BigInteger;
import java.util.Scanner;

public class Smallfactorials {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger p;
		int t = in.nextInt();
		while(t > 0){
			/*int fact = 1;
			int input = in.nextInt();
			for(int i=1; i<=input; i++){
				fact = fact * i;
			}
			System.out.println(fact );*/
			
		    int n;
            n= in.nextInt();
            p=new BigInteger("1");
            for(int i=2;i<=n;i++)
            p=p.multiply(new BigInteger(""+i));
            System.out.println(p);
            
			t--;
		}
	}
	
	 

}
