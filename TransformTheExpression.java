package beginner;

import java.util.Scanner;
import java.util.Stack;

public class TransformTheExpression {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String s = in.nextLine();
		Stack stack = new Stack();
		
		String postFix = "";
		for(int i = 0; i < s.length(); i++){
			
			if(s.charAt(i) == '(' ||s.charAt(i) == ')' || s.charAt(i) == '^' ||s.charAt(i) == '*' ||
					s.charAt(i) == '+' ||s.charAt(i) == '/' ||s.charAt(i) == '-'){
				stack.push(s.charAt(i));
				
				TransformTheExpression te = new TransformTheExpression();
				int val = te.getPre(s.charAt(i));
				
				
			    if(s.charAt(i) == ')'){
					for(int j = stack.size(); j>0; j--){
						char c = stack.pop();
						if( == '('){
							break;
						}
						postFix += 
					}
				} 
			}else{
				postFix +=s.charAt(i);
			}
		}
	}
	
	public int getPre(char x)
	{
		switch(x)
		{
		case '^': return 4;
		case '*':
		case '/': return 3;
		case '+':
		case '-': return 2;
		case '(': return 1;
		}
		return 0;
	}

}
