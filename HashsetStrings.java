import java.util.HashSet;

public class HashsetStrings {
    HashSet<String> set=new HashSet<>();
        for(int i=0;i<t;i++){
        String s1=pair_left[i]+" "+pair_right[i];
        String s2=pair_right[i]+" "+pair_left[i];

        if(!set.contains(s2))
            set.add(s1);

        System.out.println(set.size());
    }
}
