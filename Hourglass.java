import java.util.List;

public class Hourglass {
    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here
        int max=Integer.MIN_VALUE;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                int sum = arr.get(i).get(j)+ arr.get(i).get(j+1)+arr.get(i).get(j+2) + arr.get(i+1).get(j+1)+arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);
                max=Math.max(sum,max);
            }
        }
        return max;
    }
}
