package codeChef_beginner;

import java.util.Scanner;

public class LifeTheUniverseAndEverything {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i;
		while(true){
			i = in.nextInt();
			
			if(i == 42) {
				break;
			}else {
				System.out.println(i);
			}
		}

	}

}
