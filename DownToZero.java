import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class DownToZero {
//    public static int downToZero(int n) {
//        // Write your code here
//        int[] dp=new int[n+1];
//        dp[0]=0;
//
//        for(int i=1;i<=n;i++){
//            dp[i]=dp[i-1]+1;
//
//            for(int a=2;a*a<=i;a++){
//                if(i%a==0){
//                    int b=i/a;
//                    dp[i]=Math.min(dp[i],dp[Math.max(a,b)]+1);
//                }
//            }
//        }
//        return dp[n];
//    }

    static class Pair{
        int first;
        int second;

        public Pair(int a,int b){
            first = a;
            second = b;
        }
    }

    public static int downToZero(int n) {
        // Write your code here
        Queue<Pair> q = new LinkedList<>();
        Set<Integer> vis = new HashSet<>();

        q.add(new Pair(n, 0));
        vis.add(n);

        while(!q.isEmpty()){
            Pair curr = q.poll();
            int num = curr.first;
            int moves = curr.second;

            if(num == 0) return moves;

            //first operation -- decrement ke liye
            if(!vis.contains(num-1)){
                q.add(new Pair(num-1, moves+1));
                vis.add(num-1);
            }

            //second operation -- factor ke liye
            for(int i=2 ; i*i <= num ; i++){
                if(num % i == 0){
                    int a = i;
                    int b = num/i;

                    int maxAB = Math.max(a,b); //max factor

                    if(!vis.contains(maxAB)){
                        q.add(new Pair(maxAB, moves+1));
                        vis.add(maxAB);
                    }
                }
            }
        }

        return -1;
    }
}
