package StreamsExample;

import java.util.*;

public class NonRepeatedCharacter {
    public static void main(String args[]) {

        String input = "Java Hungry Blog Alive is Awesome";
        Set<Character> sortedInput = new LinkedHashSet<>();
        for (char c : input.toCharArray()) {
            sortedInput.add(c);
        }
        System.out.println(sortedInput.stream().findFirst());
        List<Character> charList = new ArrayList<>(sortedInput);
        System.out.println(charList.get(6));

    }
}