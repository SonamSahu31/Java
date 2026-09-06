package String;
import java.util.Arrays;
public class LongestPalindromeSubseqence {
    public int longestPalindromeSubsequence(String s) {
        // Dynamic programming approach to find the longest palindromic subsequence
        int n = s.length();
        int [][]dp = new int[n][n];
        // Base case: single character palindromes
        for(int i=0; i<n; i++){
            dp[i][i] = 1;
        }
         //Length of substring
        for(int len=2; len<=n; len++){
            // Iterate over all possible starting indices of substrings of length len
            for(int i=0; i<n-len+1; i++){
                // Calculate the ending index of the substring
                int j = i+len-1;//j is the ending index of the substring and i is the starting index of the substring

                // If the characters at the start and end of the substring are not equal, we take the maximum of the two possible palindromic subsequences
                if(s.charAt(i)==s.charAt(j)){
                    // If the characters at the start and end of the substring are equal, we can extend the palindrome
                    if(len==2){
                        dp[i][j] = 2;
                    }
                    else{
                        dp[i][j] = dp[i+1][j-1]+2;
                    }
                }
                else{
                    // If the characters at the start and end of the substring are not equal, we take the maximum of the two possible palindromic subsequences
                    dp[i][j]= Math.max(dp[i+1][j], dp[i][j-1]);
                }    


            }
        }

       return dp[0][n-1];// Return the length of the longest palindromic subsequence for the entire string
    }

    public static void main(String[]args){
        String s = "bbbb";
        LongestPalindromeSubseqence lps = new LongestPalindromeSubseqence();
        System.out.println("The length of the longest palindromic subsequence is: " + lps.longestPalindromeSubsequence(s));

    }
        
    
}
