package LeetCode;

public class Pangram {

    public static void main(String args[]) {
        String sentence  = "leetcodeleetcodeleetcodeleetcodeleetcodeleetcodep";
       boolean checkPangram = checkIfPangram(sentence);
       System.out.println("checkPangram "+checkPangram);
    }

    private static boolean checkIfPangram(String sentence) {
        char[] alphabetArray = new char[26];
        char currentChar = 'a';
        for (int i = 0; i < alphabetArray.length; i++) {
            alphabetArray[i] = currentChar;
            currentChar++;
        }

       if(sentence.contains(alphabetArray.toString())){
           if(sentence.length()>=26)    {
               return true;
           }

       }
        return false;
    }
}
