package LeetCode;

import java.util.Arrays;
import java.util.List;

public class TruncateSentence {
    public static void main(String args[]) {
        String s = "chopper is not a tanuki";
        int k = 5;
       truncateSentence(s,k);

    }
    public static String truncateSentence(String s, int k) {

        StringBuilder sb = new StringBuilder();
        String [] words = s.split(" ");
        int count =0;
        for(String w: words){
            if(count <= k-1){
                sb.append(w).append(" ");
            }
            count ++;
        }
        return sb.toString().substring(0, sb.length() - 1);
    }
}
