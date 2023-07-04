package LeetCode;

import java.util.Arrays;

public class DecodeMessage {

    public static void main(String[] args) {
        String inputString = "zwx hnfx lqantp mnoeius ycgk vcnjrdb";
        String key = "eljuxhpwnyrdgtqkviszcfmabo";
        System.out.println("inputString : "+inputString);
        System.out.println("key : "+key);
        String finalString = decodeMessageByKey(inputString, key);
        System.out.println("finalString : "+finalString);

    }

    private static String decodeMessageByKey(String inputString, String key) {

        char[] message = inputString.toCharArray();
        char[] decodeKey = key.replaceAll("\\s", "").toCharArray();
        char[] alphabetArray = new char[26];
        char currentChar = 'a';

        StringBuilder stringBuilder = new StringBuilder();
        String finalMessage = null;
        for (int i = 0; i < alphabetArray.length; i++) {
            alphabetArray[i] = currentChar;
            currentChar++;
        }
        int index = -1;
        for (char m :message) {
            if(Character.isWhitespace(m)){
                finalMessage = stringBuilder.append(" ").toString();
            }
            for (int i = 0; i < decodeKey.length; i++) {
                if (decodeKey[i] == m) {
                    index = i;
                    char finalString = alphabetArray[index];
                    finalMessage = stringBuilder.append(finalString).toString();
                    break;
                }

            }
        }

        System.out.println("message : "+ Arrays.toString(message));
        System.out.println("key : "+Arrays.toString(decodeKey));
        System.out.println("alphabets : "+Arrays.toString(alphabetArray));

        return finalMessage;
    }
}
