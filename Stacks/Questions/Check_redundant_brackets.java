/*For a given expression in the form of a string, 
find if there exist any redundant brackets or not. 
It is given that the expression contains only rounded brackets or parenthesis 
and the input expression will always be balanced.
A pair of the bracket is said to be redundant when a sub-expression
 is surrounded by unnecessary or needless brackets.
 

 Sample Input 1:
a+(b)+c 
Sample Output 1:
true
Explanation:
The expression can be reduced to a+b+c. Hence, the brackets are redundant.
Sample Input 2:
(a+b)
Sample Output 2:
false

 */



package Stacks.Questions;

import java.util.Stack;

public class Check_redundant_brackets {
    public static boolean checkRedundantBrackets(String expression) {
		//Your code goes here
		
		Stack<Character> t1 = new Stack<>();
		Stack<Character> t2= new Stack<>();

		for(int i = 0 ; i < expression.length(); i++){

			if(expression.charAt(i) == '(' || expression.charAt(i) == ')' ){
				t1.push(expression.charAt(i));
			}else{
			if(t1.peek() == '(' && expression.charAt(i) != '+' && expression.charAt(i) != '-' &&
			expression.charAt(i) != '*' && expression.charAt(i) != '/'){
				t2.push(expression.charAt(i));
			}
			}
		}
		return (!(t1.size() == t2.size()));
	}
}
