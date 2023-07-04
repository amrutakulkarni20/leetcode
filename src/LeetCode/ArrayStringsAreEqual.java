package LeetCode;

public class ArrayStringsAreEqual {
    public static void main(String[] args) {
        String[]  word1 = {"a", "cb"};
        String[]  word2 = {"ab", "c"};

        System.out.println("word1 : "+word1);
        System.out.println("word2 : "+word2);
        boolean finalCheck = isArrayStringsAreEqual(word1, word2);
        System.out.println("finalCheck : "+finalCheck);

    }

    private static boolean isArrayStringsAreEqual(String[] word1, String[] word2) {
        String firstWord = null;
        String secondWord = null;
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (String s:word1) {
            firstWord = sb1.append(s).toString();
        }
        for (String s:word2) {
            secondWord = sb2.append(s).toString();
        }
        if(firstWord.equalsIgnoreCase(secondWord)){
            return true;
        }
        return false;
    }

}
