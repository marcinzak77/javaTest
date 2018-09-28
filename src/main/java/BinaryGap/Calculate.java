package BinaryGap;

public class Calculate {
    public String checkIt(String s) {
        if (s.length() == 0 || s == null) {
            return "EMPTY";
        } else
            return "NOT EMPTY";
    }

    public static void main(String[] args) {
        Calculate a = new Calculate();
        System.out.println(a.checkIt(null));
    }
}
