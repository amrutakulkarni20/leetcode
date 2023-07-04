package LeetCode;

public class RemoveVowels {
    public static void main(String args[]) {

        String input = "Remove Vowels from a given String";
        System.out.println("String without Vowels : "+input.replaceAll("[aeiouAEIOU]","") );
    }
}