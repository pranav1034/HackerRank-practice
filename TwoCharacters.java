import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class TwoCharacters {
    class Result {

        /*
         * Complete the 'alternate' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts STRING s as parameter.
         */

        public static int alternate(String s) {
            // Write your code here
            HashSet<Character> set=new HashSet<>();

            for(char c:s.toCharArray()){
                set.add(c);
            }

            List<Character> list=new ArrayList<>(set);
            int maxLength=0;

            for(int i=0;i<list.size();i++){
                for(int j=i+1;j<list.size();j++){
                    char a =list.get(i);
                    char b=list.get(j);

                    StringBuilder sb=new StringBuilder();

                    for(char c:s.toCharArray()){
                        if(c==a || c==b) sb.append(c);
                    }

                    if(isAlternating(sb.toString())){
                        maxLength=Math.max(maxLength,sb.length());
                    }
                }
            }
            return maxLength;

        }

        public static boolean isAlternating(String s){
            for(int i=1;i<s.length();i++){
                if(s.charAt(i)==s.charAt(i-1)){
                    return false;
                }
            }
            return true;
        }
    }

}
