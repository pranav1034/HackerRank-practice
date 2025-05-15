import java.util.*;

public class WaiterProblem {
    class Result {

        /*
         * Complete the 'waiter' function below.
         *
         * The function is expected to return an INTEGER_ARRAY.
         * The function accepts following parameters:
         *  1. INTEGER_ARRAY number
         *  2. INTEGER q
         */
        public static List<Integer> generatePrimeNumbers(int q){
            List<Integer> p= new ArrayList<>();
            int num=2;

            while (p.size() < q) {
                boolean isPrime = true;

                if (num < 2) isPrime = false;
                else {
                    for(int i=2;i<=Math.sqrt(num);i++) {
                        if (num%i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                }

                if(isPrime){
                    p.add(num);
                }
                num++;
            }

            return p;
        }

        public static List<Integer> waiter(List<Integer> number, int q) {
            // Write your code here
            List<Integer> result =new ArrayList<>();
            List<Integer> primes=generatePrimeNumbers(q);

            Stack<Integer> st = new Stack<>();
            for(int i=0;i<number.size();i++){
                st.push(number.get(i));
            }

            for(int i=0;i<q;i++){
                int prime = primes.get(i);
                Stack<Integer> A=new Stack<>();
                Stack<Integer> B=new Stack<>();

                while(!st.isEmpty()){
                    int curr=st.pop();
                    if(curr%prime ==0) A.push(curr);
                    else B.push(curr);
                }

                while(!A.isEmpty()) result.add(A.pop());

                st=B;
            }

            while(!st.isEmpty()) result.add(st.pop());

            return result;

        }

    }
}
