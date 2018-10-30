package BinaryGap;

import org.junit.Test;

import static org.junit.Assert.*;

public class TapeEquilibriumTest {

    @Test
    public void testSolution() {
        //Given
        int[] A = new int[5];
        A[0] = -10;
        A[1] = -5;
        A[2] = -3;
        A[3] = -4;
        A[4] = -5;
        //When
        TapeEquilibrium tape = new TapeEquilibrium();
        int solution = tape.solution(A);
        //Then
        System.out.println(solution);
    }

}