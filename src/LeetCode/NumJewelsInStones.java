package LeetCode;

import java.util.Arrays;
import java.util.List;

public class NumJewelsInStones {
    public static void main(String args[]) {
        numJewelsInStones("aA","aAAbbbb");
    }

    public static int numJewelsInStones(String jewels, String stones){
        List<String> stonesList = Arrays.asList(stones.split(""));
        List<String> jewelsList = Arrays.asList(jewels.split(""));

        long count = stonesList.stream()
                .filter(jewelsList::contains)
                .count();

        System.out.println("Count is " + count);

        return (int)count;
    }
}
