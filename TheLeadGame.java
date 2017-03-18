package beginner;

import java.util.Scanner;

public class TheLeadGame {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int numberOfRounds = in.nextInt();
		int maxLead = 0;
		int player = 0;
		int winner = 0;
		int sc_1=0, sc_2=0;
		while(numberOfRounds > 0){
			int firstPlayer = in.nextInt();
			int secondPlayer = in.nextInt();
			sc_1 = sc_1 + firstPlayer;
			sc_2 = sc_2 + secondPlayer;
			
			int diff = 0;
			
			if(sc_1 > sc_2){
				diff = sc_1 - sc_2;
				player = 1;
			}else{
				diff = sc_2 - sc_1;
				player = 2;
			}
			
			if(maxLead < diff){
				maxLead = diff;
				winner = player;
			}
			numberOfRounds--;
		}
		
		System.out.println(winner +" "+maxLead);
	}

}
