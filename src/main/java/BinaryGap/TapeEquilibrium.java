package BinaryGap;

public class TapeEquilibrium {
    public int solution(int[] A) {
        int sum = 0;
        int value = A[0];
        for (int i = 1; i < A.length; i++) {
            sum += A[i];
        }
        int number = A[0] - sum;
        for (int j = 1; j < A.length; j++) {
            if (Math.abs(value - sum) < Math.abs(number)) {
                number = value - sum;
            }
            sum -= A[j];
            value += A[j];
        }
        return Math.abs(number);
    }
}
