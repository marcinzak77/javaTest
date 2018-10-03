package Training;

import java.util.stream.IntStream;

public class PermMissingElem {

    public int solution(int[] A) {

        int size = A.length + 1;
        int sum = IntStream.of(A).sum();
        int total = (size * (size + 1)) / 2;
        return total - sum;
    }
}


