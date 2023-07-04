package StreamsExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {

    public static void main (String args []){
        List<Integer> list = Arrays.asList(10,30,45,22,25,40,45);
        List<Integer> evenNumberList = list.stream()
                                            .filter(n -> n%2 == 0)
                                            .collect(Collectors.toList());
        System.out.println("Even Number List : " + evenNumberList);

    }
}
