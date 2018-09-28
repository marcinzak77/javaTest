package BinaryGap;

public class Task1 {
    public static int fibonacci(int input) {
        int fibonacci = 0;
        int num = 0;
        int num2 =1;
        for (int loop = 0; loop < input; loop ++)
        {
            fibonacci = num + num2;
            num = num2;
            num2 = fibonacci;
        }
        return num;
    }

    public static void main(String[] arg) {
        int value = fibonacci(5);
        System.out.println(fibonacci(5));
    }
}
