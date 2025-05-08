import java.util.*;
public class QueueUsing2Stacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        while (q > 0) {
            int x = sc.nextInt();

            if (x == 1) {
                int n = sc.nextInt();
                s1.push(n);
            } else {
                if (s2.isEmpty()) {
                    while (!s1.isEmpty()) {
                        s2.push(s1.pop());
                    }
                }

                if (x == 2) {
                    if (!s2.isEmpty()) {
                        s2.pop();
                    }
                } else if (x == 3) {
                    if (!s2.isEmpty()) {
                        System.out.println(s2.peek());
                    }
                }
            }
            q--;
        }
    }
}
