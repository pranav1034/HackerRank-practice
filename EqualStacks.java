import java.util.List;

public class EqualStacks {
    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {

        int sum=0; int sum2 =0; int sum3=0;

        for(int i=0;i<h1.size();i++){
            sum+=h1.get(i);
        }

        for(int i=0;i<h2.size();i++){
            sum2+=h2.get(i);
        }

        for(int i=0;i<h3.size();i++){
            sum3+=h3.get(i);
        }

        int l1=0,l2=0,l3=0;

        while(sum!=sum2 || sum2!=sum3){
            if(sum>sum2 && sum>sum3){
                sum-=h1.get(l1);
                l1++;
            }
            else if(sum2>sum || sum2>sum3){
                sum2-=h2.get(l2);
                l2++;
            }
            else{
                sum3-=h3.get(l3);
                l3++;
            }
            if(h1.size()==0 || h2.size()==0 || h3.size()==0){
                return 0;
            }
        }
        return sum;
    }

}
