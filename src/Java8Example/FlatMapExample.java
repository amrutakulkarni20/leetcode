package Java8Example;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {

    public static void main(String[] args) {
        List<List<String>> fruit = Arrays.asList(
                Arrays.asList("Apple","mango","Kiwi"),
                Arrays.asList("mango","Kiwi"),
                Arrays.asList("pineapple"),
                Arrays.asList("kiwi","Apple","Banana"));
        System.out.println("List of fruit-" + fruit);


        List list = fruit.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println("list using flatmap" + list);
    }
}
