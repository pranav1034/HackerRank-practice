import java.util.List;
//link : https://www.hackerrank.com/challenges/array-left-rotation/problem?isFullScreen=true


public class LeftRotation {
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here
        int n=arr.size();
        d=d%n;
        reverse(arr,0,d);
        reverse(arr,d,n);
        reverse(arr,0,n);
        return arr;
    }
    public static void reverse(List<Integer> arr,int start,int end){
        while(start<end){
            int temp=arr.get(start);
            arr.set(start,arr.get(end-1));
            arr.set(end-1,temp);
            start++;
            end--;
        }
    }
}
