package LeetCode;

import org.omg.Messaging.SyncScopeHelper;

public class FinalValueAfterOperations {
    public static void main(String args[]) {

        String[] operations = {"X++","++X","--X","X--"};
        int x = 0;
        int y = 1;
        for (String operation :operations) {
            if(operation.equalsIgnoreCase("X++") || operation.equalsIgnoreCase("++X") ){
               x= x+y;
            }
            else if (operation.equalsIgnoreCase("X--") || operation.equalsIgnoreCase("--X")){
                x = x-y;
            }
        }
        System.out.println("Value of X is " + x);

    }
}
