package Training;

public class UniqueInArray {
    public int solution(int[] A) {
        // write your code in Java SE 8


        int res = A[0];
        for (int i = 1; i < A.length; i++)
            res = res ^ A[i];

        return res;
    }
}
