package beginner;

import java.util.Scanner;

public class CuttingRecipes {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		CuttingRecipes cp = new CuttingRecipes();
		int t = in.nextInt();
		
		while(t-- > 0){
			int n = in.nextInt();
			
			int arr[] = new int[n];
			if(n>1){
				arr[0] = in.nextInt();
				arr[1] = in.nextInt();
				
				int l = cp.gcd(arr[0],arr[1]);
				for(int i = 2; i<n; i++){
					arr[i] = in.nextInt();
					l = cp.gcd(l,arr[i]);
				}
				
				for(int i=0; i<n; i++){
					if(l != 0){
						System.out.print(arr[i]/l);
					}
				}
			}
		}
	}
	
	public int gcd(int a, int b){
		for(;;){
			if(a == 0){
				return b;
			}
			b %= a;
			
			if(a == 0){
				return b;
			}
			a %= b;
		}
	}

}
