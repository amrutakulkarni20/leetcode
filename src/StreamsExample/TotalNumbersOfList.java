package StreamsExample;

import java.util.Arrays;
import java.util.List;

public class TotalNumbersOfList {
    public static void main (String args []) {
        List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        long totalNumbers = list.stream().count();
        System.out.println("Total Numbers : " + totalNumbers);
    }
}
