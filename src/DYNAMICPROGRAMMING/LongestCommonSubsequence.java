package DYNAMICPROGRAMMING;

public class LongestCommonSubsequence {
    public int longestSubsequence(String text1, String text2){
        char[] s1 = text1.toCharArray();
        char[] s2 = text2.toCharArray();
        return lcs(s1, s2);
    }

    public static int lcs(char[] s1, char[] s2){
        int[][] dp = new int[s1.length+1][s2.length+2];
        for (int i=1; i<=s1.length; i++){
            for (int j=1; j<=s2.length; j++){
                int ans = 0;
                if(s1[i-1] == s2[j-1]){
                    ans = 1 + dp[i-1][j-1];
                }else {
                    int a = dp[i-1][j];
                    int b = dp[i][j-1];
                    ans = Math.max(a, b);

                }
                dp[i][j] = ans;
            }
        }
        return dp[s1.length][s2.length];
    }

    public static void main(String[] args){
        String text1 = "abcdef";
        String text2 = "acef";
        LongestCommonSubsequence longestCommonSubsequence = new LongestCommonSubsequence();
        int result = longestCommonSubsequence.longestSubsequence(text1, text2);
        System.out.println("The longest common subsequences are: "+result);
    }
}
