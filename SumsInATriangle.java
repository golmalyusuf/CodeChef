package beginner;

import java.util.Scanner;

public class SumsInATriangle {
	public static void main(String asdf[]){
		Scanner in = new Scanner(System.in);
		
		int testCases = in.nextInt();
		
		while(testCases >0){
			int row = in.nextInt();
			long arr[][] = new long[row][row];
			
			 
			for(int i=0; i<row; i++){
				for(int j=0; j< i+1; j++){
					arr[i][j] = in.nextInt();
				}
			}
			
			for(int i=row-1; i>=0;i-- ){
				for(int j=0; j<i; j++){
					 
				    if(arr[i][j] >= arr[i][j+1]){
					 	arr[i-1][j] = arr[i-1][j]+arr[i][j];
					}else if(arr[i][j] < arr[i][j+1]){
						arr[i-1][j] = arr[i-1][j]+arr[i][j+1];
					} 
				}
			}
			
			testCases--;
			System.out.println(arr[0][0]);
		} 
		
	}
}
