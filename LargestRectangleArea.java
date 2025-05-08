import java.util.List;
import java.util.*;

public class LargestRectangleArea {
    public static int [] nextSmaller(List<Integer> h){
        Stack<Integer> stack = new Stack<>();
        int [] ans = new int[h.size()];
        stack.push(-1);

        for(int i=h.size()-1 ; i>=0 ; i--){

            int curr = h.get(i);

            while(stack.peek() != -1 && h.get(stack.peek()) >= curr){
                stack.pop();
            }

            ans[i] = stack.peek();
            stack.push(i);
        }

        return ans;
    }


    public static int [] prevSmaller(List<Integer> h){
        Stack<Integer> stack = new Stack<>();
        int [] ans = new int[h.size()];
        stack.push(-1);

        for(int i=0 ; i<h.size() ; i++){
            int curr = h.get(i);

            while(stack.peek()!= -1 && h.get(stack.peek()) >= curr){
                stack.pop();
            }

            ans[i] = stack.peek();
            stack.push(i);
        }

        return ans;
    }

    public static long largestRectangle(List<Integer> h) {
        // Write your code here
        int [] next = nextSmaller(h);
        int [] prev = prevSmaller(h);
        int n = h.size();

        int maxa = -1,width = -1;


        for(int i=0 ; i<h.size() ; i++){
            if(next[i] == -1){
                next[i] = n;
            }

            width = next[i] - prev[i] - 1;
            int length = h.get(i);
            int area = width*length;

            maxa = Math.max(maxa,area);
        }

        return maxa;
    }
}