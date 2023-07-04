package LeetCode;

public class Interpret {
    public static void main(String args[]) {
        String command = "G()()()()(al)";
        interpretWord(command);
    }

    private static String interpretWord(String command) {

        StringBuilder builder = new StringBuilder();
        for (char c : command.toCharArray()) {
           if(command.matches("                                                                                                                                                                          ")){
               builder.append('G');
           }
           else if(command.matches("()")){
               builder.append('o');
           }
           else if(command.matches("(al)")){
               builder.append("al");
           }
        }
        System.out.println(" Final String is Gooooal : -> "+builder.toString());
        return builder.toString();
    }
}
