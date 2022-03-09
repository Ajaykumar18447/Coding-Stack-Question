package Stack;

import java.util.Scanner;
import java.util.Stack;

public class balance {
    public static boolean isValid(String s) {
        
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                 st.add(c);
            }else{
                if(st.isEmpty())return false;
                if(c==')' && st.peek() != '(') return false;
                if(c=='}' && st.peek() != '{') return false;
                if(c==']' && st.peek() != '[') return false;
                
                
                
                
                
                st.pop();
            }
               
        }
     return st.isEmpty();
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        if(isValid(s)==true)
        System.out.println("True");
        else
        System.out.println("False");

        
    }
        
    
}
