package LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Example {

    public static String KUniqueCharacters(String str) {
        // code goes here
        int k = Character.getNumericValue(str.charAt(0));
        int uniqueCount = 0;
        int maxlength = 0;
        int startIndex = 1;
        int maxStartIndex =1;
        Map<Character, Integer> charCount = new HashMap<>();
        for(int i=1; i< str.length(); i++){
            char currentChar =str.charAt(i);
            charCount.put(currentChar, charCount.getOrDefault(currentChar,0)+1);

            if(charCount.get(currentChar) == 1){
                uniqueCount ++;
            }

            while (uniqueCount > k){

                char startChar = str.charAt(startIndex);
                charCount.put(startChar, charCount.get(startChar) - 1);

                if(charCount.get(startChar) == 0){
                    uniqueCount --;
                }
                startIndex++;
            }

            if(i - startIndex +1 > maxlength){
                maxlength = i-startIndex+1;
                maxStartIndex = startIndex;
            }
        }
        return str.substring(maxStartIndex,maxStartIndex + maxlength);
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(KUniqueCharacters(s.nextLine()));
       // System.out.println(KUniqueCharacters("3aabacbebebe")); // Output: cbebebe
        //System.out.println(KUniqueCharacters("2aabbcbbbadef")); // Output: bbcbbb
    }


}
