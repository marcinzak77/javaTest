package BinaryGap;

import java.util.HashSet;
import java.util.Set;

public class test {

    public static String[] findCommon(String[] names1, String[] names2) {
        Set<String> set = new HashSet<>();
        for (String name: names1) {
            set.add(name);
        }
        for (String name: names2) {
            set.add(name);
        }
        String[] result = set.toArray(new String[set.size()]);
        return result;


    }

    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", test.findCommon(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}
