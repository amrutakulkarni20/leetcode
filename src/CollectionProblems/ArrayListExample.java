package CollectionProblems;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main (String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(3);
        list.add(9);
        list.add(1);
        System.out.println("ArrayList before operation is " +list);
        list.add(2,10);
        System.out.println("Add an Element in an ArrayList " + list);
        System.out.println("Remove an Element in an ArrayList " +list.remove(1));
        list.set(0,50);
        System.out.println("Update an Element in an ArrayList " +list);
        System.out.println("Reverse an Element in an ArrayList " +reverseArrayList(list));


    }

    private  static List<Integer>  reverseArrayList(List<Integer> list ) {
        for (int i = 0, j = list.size() - 1; i < j; i++) {
            list.add(i, list.remove(j));
        }
        return list;
    }
}
