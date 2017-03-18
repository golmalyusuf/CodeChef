package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LuckyFour {
	public static void main(String[] args) throws IOException {
		InputStreamReader r=new InputStreamReader(System.in);    
	    BufferedReader br=new BufferedReader(r);
	    
		int t =  Integer.parseInt(br.readLine());
		while(t > 0){
			String str = br.readLine(); 
			int count = 0;
			for(int i=0; i<str.length(); i++){
				char c = str.charAt(i);
				if(c == '4'){
					count++;
				}
			}
			System.out.println(count);
			t--;
		}
	}
}
