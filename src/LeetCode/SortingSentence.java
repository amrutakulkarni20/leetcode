package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingSentence {
    public static void main(String[] args) {

        String inputString = "is2 sentence4 This1 a3";
        System.out.println("inputString : "+inputString);
        String finalString =  sortSentence(inputString);
        System.out.println("finalString : "+finalString);//This is a sentence

    }

    private static String sortSentence(String inputString) {
        StringBuilder sb = new StringBuilder();
        String[] words = inputString.split(" ");
        String [] finalSentence = new String[inputString.length()];
        for (String s: words) {
            int number = Integer.valueOf(s.replaceAll("\\D+", ""));
            finalSentence[number] = s.replaceAll("\\d+", "");
        }
        for(String s : finalSentence){
            if(s != null){
                sb.append(s).append(" ");
            }
        }
        return sb.toString().substring(0, sb.length() - 1);
    }
}
