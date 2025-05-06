//link: https://www.hackerrank.com/challenges/common-child/problem?isFullScreen=true

public class CommonChild {
    public static int commonChild(String s1, String s2) {
        // Write your code here
        int[][] arr=new int[s1.length()][s2.length()];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j]=-1;
            }
        }

        return calculateLcs(s1, s2, 0, 0,arr);
    }
    public static int calculateLcs(String s1, String s2,int i,int j,int[][] arr){
        if(i== s1.length() || j==s2.length())
            return 0;

        if(arr[i][j]!=-1)
            return arr[i][j];

        if(s1.charAt(i)==s2.charAt(j))
            return arr[i][j]=1 + calculateLcs(s1, s2, i+1, j+1,arr);

        else
            return arr[i][j]= Math.max(calculateLcs(s1, s2, i+1, j,arr),calculateLcs(s1, s2, i, j+1,arr));
    }
}
