import java.util.ArrayList;
import java.util.List;

public class StringSwapper {

    public static void main(String[] args) {
        String s1 = "ab";
        String g1 = "ba";
        System.out.println(canSwap(s1, g1)); // Output: true
    }

    public static boolean canSwap(String s, String g) {
        if (s.length() != g.length()) {
            return false;
        }

        List<Integer> mismatchIndices = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != g.charAt(i)) {
                mismatchIndices.add(i);
            }
        }

        if (mismatchIndices.size() != 2) {
            return false;
        }

        int index1 = mismatchIndices.get(0);
        int index2 = mismatchIndices.get(1);

        return s.charAt(index1) == g.charAt(index2) && s.charAt(index2) == g.charAt(index1);
    }
}
