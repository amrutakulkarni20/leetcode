package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MostWordsFound {

    public static void main(String args[]) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much" };
        mostWordsFound(sentences);
    }

    private static int mostWordsFound(String[] sentences) {
        List<String> list = Arrays.asList(sentences);
        int count = 0;
        int finalCount = 0;
        for (String str :list) {
            String[] words = str.split("\\s+");
            count = words.length;
            if(count> finalCount){
               finalCount = count;
            }
        }
        System.out.println("finalCount  "+finalCount);
        return finalCount;
    }

}
