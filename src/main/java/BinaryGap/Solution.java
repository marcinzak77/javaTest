package BinaryGap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {

    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
      //  int[] newArray = new int[A.length];
            int[] newArray = Arrays.copyOf(A, A.length);


            for (int j = 0; j < A.length; j++) {
                newArray[(j + K) % A.length] = A[j];
            }

        return newArray;
    }
//    public int solution(int[] A) {
//        // write your code in Java SE 8
//
//
//        int res = A[0];
//        for (int i = 1; i < A.length; i++)
//            res = res ^ A[i];
//
//        return res;
//    }
}
