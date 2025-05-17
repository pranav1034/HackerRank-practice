import java.util.ArrayList;
import java.util.*;
import java.util.List;

public class TimeIntervals {
    public static void main(String[] args) {
        List<List<Integer>> intervals = Arrays.asList(
                Arrays.asList(1, 5),
                Arrays.asList(2, 3),
                Arrays.asList(11, 15),
                Arrays.asList(20, 30)
        );


        Collections.sort(intervals, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> l1, List<Integer> l2) {
                int n1=l1.get(0);
                int n2=l2.get(0);
                return n1-n2;
            }
        });

        boolean flag = true;
        for(int i=0;i< intervals.size()-1;i++){
            if(intervals.get(i).get(1)>intervals.get(i+1).get(0)) {
                flag = false;
                break;
            }
        }

        if(flag){
            System.out.println("The intervals are within the range.");
        }else{
            System.out.println("The intervals are not within the range.");
        }
    }
}
