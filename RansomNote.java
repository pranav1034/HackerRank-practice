import java.util.HashMap;
import java.util.List;
//link: https://www.hackerrank.com/challenges/ctci-ransom-note/problem?isFullScreen=true

public class RansomNote {
    public static void checkMagazine(List<String> magazine, List<String> note) {
        // Write your code here
        HashMap<String,Integer> map= new HashMap<>();
        for(String s: magazine){
            map.put(s,map.getOrDefault(s, 0)+1);
        }

        for(String word:note){
            if(!map.containsKey(word)||map.get(word)==0){
                System.out.print("No");
                return;
            }
            map.put(word,map.get(word)-1);
        }
        System.out.print("Yes");
    }
}
