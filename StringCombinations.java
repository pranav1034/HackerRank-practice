import java.util.*;
public class StringCombinations {
    public static void main(String[] args) {
        String s="1221";
//        List<String> result = new ArrayList<>();
//        generateCombinations(s, 0, "", result);
//        System.out.println(result.size());
        System.out.println(countCombinations(s));
    }

    public static void generateCombinations(String s,int idx, String current,List<String> result){
        if(idx==s.length()){
            result.add(current);
            return;
        }

        int oneDigit= Integer.parseInt(s.substring(idx,idx+1));
        if(oneDigit!=0){
            generateCombinations(s,idx+1,current + (char)('a'+oneDigit-1),result);
        }

        if(idx<s.length()-1){
            int twoDigits= Integer.parseInt(s.substring(idx,idx+2));
            if(twoDigits<=26){
                generateCombinations(s,idx+2,current + (char)('a'+twoDigits-1),result);
            }
        }
    }

    public static int countCombinations(String s){
        if(s.length()==0 || s.charAt(0)=='0'){
            return 0;
        }

        int n=s.length();
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;

        for(int i=2;i<=n;i++) {
            int oneDigit = Integer.parseInt(s.substring(i - 1, i));
            int twoDigits = Integer.parseInt(s.substring(i - 2, i));

            dp[i] += dp[i - 1];

            if (twoDigits >= 10 && twoDigits < 27) {
                dp[i] += dp[i - 2];
            }
        }
        return dp[n];
    }
}
