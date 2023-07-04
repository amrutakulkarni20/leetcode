package StreamsExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersStartWith1 {

    public static void main (String args []) {
        List<Integer> list = Arrays.asList(10,30,45,12,25,40,15);
        List<String> numberStartWith1 = list.stream()
                .map(n -> n + "")
                .filter(n -> n.startsWith("1"))
                .collect(Collectors.toList());

        System.out.println("Number Start With 1 : " + numberStartWith1);

    }
}
