public class StringExample1 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        String A = "abc";
        String B = "def";

        System.out.println("A : " +A.length() + " "+"B : " +B.length());
        System.out.println("LexicographicCal "+LexicographicCal(A,B));
        System.out.println("Capitalization "+Capitalization(A,B));

    }

    public static boolean LexicographicCal (String A, String B){
        if(A.length() == B.length()){
            return true;
        }
        return false;
    }

    public static String Capitalization (String A, String B){

        String capitalA = A.toUpperCase();
        String capitalB = B.toUpperCase();

        System.out.println("capital A : " +capitalA + " "+"capital B : " +capitalB);

        StringBuilder builder = new StringBuilder();
        builder.append(capitalA).append(" ").append(capitalB);
        String completeString = builder.toString();
        return completeString;
    }
}
