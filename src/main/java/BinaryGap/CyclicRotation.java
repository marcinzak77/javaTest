package BinaryGap;

import java.util.Arrays;

public class CyclicRotation {

    public int[] solution(int[] A, int K) {
        int[] newArray = Arrays.copyOf(A, A.length);
        for (int j = 0; j < A.length; j++) {
            newArray[(j + K) % A.length] = A[j];
        }
        return newArray;
    }
}
