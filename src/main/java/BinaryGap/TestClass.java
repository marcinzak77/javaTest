package BinaryGap;
abstract class TestClass {
    abstract void calculate();

    public static void main(String[] args) {
        System.out.println("calculating");
        TestClass x = null;
        x.calculate();
    }
}