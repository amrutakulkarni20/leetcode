package StreamsExample;

import java.util.Arrays;
import java.util.List;

public class MaximumNumber {
    public static void main (String args []) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,99,32,19);

        int maxNumber = myList.stream()
                .max(Integer:: compare)
                .get();
        System.out.println("Maximum Number : " +maxNumber);
    }
}
