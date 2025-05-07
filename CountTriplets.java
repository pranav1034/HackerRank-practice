import java.util.*;

public class CountTriplets {
    static long countTriplets(List<Long> arr, long r) {

        long count=0;

        HashMap<Long,Integer> rightMap=new HashMap<>();

        for(Long l:arr){
            rightMap.put(l,rightMap.getOrDefault(l, 0)+1);
        }

        HashMap<Long,Integer> leftMap = new HashMap<>();
        for(int i=0;i<arr.size();i++){
            long mid = arr.get(i);
            long rCount=0,lCount=0;
            rightMap.put(mid,rightMap.get(mid)-1);

            if(mid%r==0){
                long left = mid/r;
                long right = mid*r;
                rCount=rightMap.getOrDefault(right,0);
                lCount=leftMap.getOrDefault(left,0);

                // int rCount=rightMap.get(right);
                count+=lCount*rCount;
            }

            leftMap.put(mid,leftMap.getOrDefault(mid, 0)+1);
        }
        return count;
    }
}
