package LeetCode;

public class BalancedStrings {
    public static void main(String[] args) {
        String s = "LLLLRRRR";
        int maxCount = maxBalancedStrings(s);
        System.out.println(maxCount);
    }

    private static int maxBalancedStrings(String s) {
        int balance = 0;
        int count = 0;

        for (char c: s.toCharArray()) {
            if(c == 'R'){
                balance ++;
            } else if (c == 'L') {
                balance --;
            }
            if(balance == 0){
                count ++;
            }
        }
        return count;
    }
}
