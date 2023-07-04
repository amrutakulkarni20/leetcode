package LeetCode;

import java.util.*;

public class CountItemsMatching {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();

        items.add(Arrays.asList("phone", "blue", "iphone"));
        items.add(Arrays.asList("computer", "silver", "iphone"));
        items.add(Arrays.asList("phone", "gold", "iphone"));
        String ruleKey = "type";
        String ruleValue = "iphone";

        int finalCount = countMatches(items, ruleKey,ruleValue);
        System.out.println("finalCount : "+finalCount);

    }

    private static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        System.out.println(items);
        Map<String, String> itemMap = new HashMap<>();
        int count =0;
        for (List<String> innerList : items) {
            for (String element : innerList) {
                itemMap.put("type",element);
            }
            if(innerList.contains(ruleValue)){
                count ++;
            }
        }
        return count;
    }
}
