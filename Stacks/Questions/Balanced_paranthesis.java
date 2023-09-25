/*For a given a string expression containing only round brackets or parentheses, 
check if they are balanced or not. Brackets are said to be balanced if the bracket
 which opens last, closes first. 
 
 Sample Input 1 :
(()()())
Sample Output 1 :
true
Sample Input 2 :
()()(()
Sample Output 2 :
false*/

package Stacks.Questions;

import java.util.Stack;

public class Balanced_paranthesis {
    public static boolean isBalanced(String expression) {
        //Your code goes here

       Stack<Character> stack = new Stack<>();
        for(int i=0;i<expression.length();i++){
            char exp=expression.charAt(i);
            if(exp == '(' ){
                stack.push(exp);
            }
            else if(exp == ')' ){
                
                if(stack.size() == 0){
                    return false; //closing brackets more condn
                }
                else{
                    stack.pop();
                }
            }
        }
        if(stack.size() > 0){
            return false; //opening brackets more condition
        }else{
            return true;
        }
    }
}
