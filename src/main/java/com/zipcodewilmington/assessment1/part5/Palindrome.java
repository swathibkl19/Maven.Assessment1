package com.zipcodewilmington.assessment1.part5;

import com.zipcodewilmington.assessment1.part1.BasicStringUtils;

public class Palindrome {

    public Integer countPalindromes(String S) {

        int N = S.length(), ans = 0;
        for (int center = 0; center <= 2 * N - 1; ++center) {
            int left = center / 2;
            int right = left + center % 2;
            while (left >= 0 && right < N && S.charAt(left) == S.charAt(right)) {
                ans++;
                left--;
                right++;
            }
        }
        return ans;


//        int result = 0;
//        String str = "";
//
//        for (int i = 0; i < input.length(); i++) {
//            for (int j = 0; j < input.length(); j++) {
//                str = input.substring(i, j);
//                if (BasicStringUtils.reverse(str).equals(str)) {
//                    result ++;
//                }
//            }
//
//            //System.out.println(input.substring(i, j));
//
//            //count++;
//        }
//         return  result;

/**
 * public class Palindrome {
 *
 *     public Integer countPalindromes(String input){
 *         //I COPIED THIS FROM THE INTERNET
 *
 *         // creat empty 2-D matrix that counts all palindrome
 *         // substring. dp[i][j] stores counts of palindromic
 *         // substrings in st[i..j]
 *         int n = input.length();
 *         char[] str = input.toCharArray();
 *         int dp[][] = new int[n][n];
 *
 *         // P[i][j] = true if substring str[i..j] is palindrome,
 *         // else false
 *         boolean P[][] = new boolean[n][n];
 *
 *         // palindrome of single lenght
 *         for (int i= 0; i< n; i++)
 *             P[i][i] = true;
 *
 *         // palindrome of length 2
 *         for (int i=0; i<n-1; i++)
 *         {
 *             if (str[i] == str[i+1])
 *             {
 *                 P[i][i+1] = true;
 *                 dp[i][i+1] = 1 ;
 *         int pDromcount=0;                             // b c c b
 *         //looping forward from front                  //   c c
 *         for (int i = 0; i < input.length() ; i++) {  //     c
 *             //looping backwards from back
 *             for(int j = input.length(); i < j; j--){
 *                 //checking if the input is the same forwards and backwards and if it is add to counter
 *                 if(isPaladromic(input.substring(i, j))){
 *                     pDromcount++;
 *                 }
 *             }
 *         }
 *         return pDromcount;
 *     }
 *
 *         // Palindromes of length more then 2. This loop is similar
 *         // to Matrix Chain Multiplication. We start with a gap of
 *         // length 2 and fill DP table in a way that gap between
 *         // starting and ending indexes increases one by one by
 *         // outer loop.
 *         for (int gap=2 ; gap<n; gap++)
 *         {
 *             // Pick starting point for current gap
 *             for (int i=0; i<n-gap; i++)
 *             {
 *                 // Set ending point
 *                 int j = gap + i;
 *
 *                 // If current string is palindrome
 *                 if (str[i] == str[j] && P[i+1][j-1] )
 *                     P[i][j] = true;
 *
 *                 // Add current palindrome substring ( + 1)
 *                 // and rest palinrome substring (dp[i][j-1] + dp[i+1][j])
 *                 // remove common palinrome substrings (- dp[i+1][j-1])
 *                 if (P[i][j] == true)
 *                     dp[i][j] = dp[i][j-1] + dp[i+1][j] + 1 - dp[i+1][j-1];
 *                 else
 *                     dp[i][j] = dp[i][j-1] + dp[i+1][j] - dp[i+1][j-1];
 *     private boolean isPaladromic(String str){
 *         for (int i = 0; i < str.length()/2; i++) {
 *             if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
 *                 return false;
 *             }
 *         }
 *
 *         // return total palindromic substrings
 *         return dp[0][n-1] + n;
 *         return true;
 *     }
 */
    }


}


