package beginner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TurboSort {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while(t>0) {
			list.add(in.nextInt());
			t--;
		}
		
		Collections.sort(list);
		for(int i:list){
			System.out.println(i);
		}
	}

}
