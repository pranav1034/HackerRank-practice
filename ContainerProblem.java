import java.util.Arrays;
import java.util.List;

public class ContainerProblem {
    public static String organizingContainers(List<List<Integer>> container) {
        // Write your code here

        int n=container.size();
        int[] sum1=new int[n];
        int[] sum2=new int[n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int balls = container.get(i).get(j);
                sum1[i]+=balls;
                sum2[j]+=balls;
            }
        }

        Arrays.sort(sum1);
        Arrays.sort(sum2);

        for(int i=0;i<n;i++){
            if(sum1[i]!=sum2[i]) return "Impossible";
        }
        return "Possible";

    }
}
