import java.util.HashSet;

public class CommonSubstring {
    public static String twoStrings(String s1, String s2) {
        // Write your code here
        // List<Character> list=new ArrayList<>();
        // for(char c: s1.toCharArray()){
        //     list.add(c);
        // }

        // for(char c2:s2.toCharArray()){
        //     if(list.contains(c2))return "YES";
        // }
        // return "NO";

        HashSet<Character> set =new HashSet<>();
        for(char c:s1.toCharArray())set.add(c);

        for(char c:s2.toCharArray()){
            if(set.contains(c)) return "YES";
        }
        return "NO";

        // int freq[]=new int[26];
        // for(char c:s1.toCharArray()){
        //     freq[c-'a']++;
        // }

        // for(char c2:s2.toCharArray()){
        //     if((freq[c2-'a'])!=0)
        //     return "YES";
        // }
        // return "NO";

    }
}

