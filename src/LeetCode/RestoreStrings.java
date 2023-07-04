package LeetCode;

import java.util.Arrays;

public class RestoreStrings {
    public static String findIndices(String inputString, int[] indices) {

        char[] charArray = inputString.toCharArray();
        int count = 0;
        char newArr[] = new char[indices.length];
        for (int i : indices) //{4,5,6,7,0,2,1,3}
        {
            newArr[i] = charArray[count];
            count++;
        }
        String str = String.valueOf(newArr);
        return str;
    }

    public static void main(String[] args) {
        String inputString = "codeleet";
        System.out.println("inputString : "+inputString);
        int indices[] = {4, 5, 6, 7, 0, 2, 1, 3};
        String finalString = findIndices(inputString, indices);
        System.out.println("finalString : "+finalString);
    }
}
