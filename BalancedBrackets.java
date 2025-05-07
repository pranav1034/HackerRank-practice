import java.util.Stack;

public class BalancedBrackets {
    public static String isBalanced(String s) {
        // Write your code here
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);

            if(c=='(' || c=='[' || c=='{') st.push(c);

            else{
                if(st.isEmpty()) return "NO";
                if( c==')' && (st.peek()!='(') || c=='}' && (st.peek()!='{') || c==']' && (st.peek()!='['))
                    return "NO";
                else
                    st.pop();
            }
        }
        return st.isEmpty()?"YES":"NO";

    }
}
