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


    }


}


