import java.util.List;

//link:https://www.hackerrank.com/challenges/crush/problem?isFullScreen=true
public class ArrayManipulation {
    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        // Write your code here
        long[] arr=new long[n+1];

        for(int i=0;i<queries.size();i++){
            List<Integer> list = queries.get(i);
            int a=list.get(0)-1;
            int b=list.get(1)-1;
            int k=list.get(2);

            arr[a]+=k;
            arr[b+1]-=k;
        }

        for(int p=1;p<arr.length;p++){
            arr[p]+=arr[p-1];
        }

        long max=Long.MIN_VALUE;
        for(long i:arr){
            max=Math.max(i,max);
        }
        return max;
    }
}
