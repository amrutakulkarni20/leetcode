package LeetCode;

public class CountNumbers {
    public static void main(String args[]) {
       int [] inputNumber =  {8,1,2,2,3};
        int [] finalNumber = smallerNumbersThanCurrent(inputNumber);
        System.out.println("finalNumber "+finalNumber);
    }

    private static int[] smallerNumbersThanCurrent(int[] nums) {
        int [] num =  new int[nums.length];
        int count = 0;
        int index = 0;
        for (int n : nums){
            for (int i =0; i<= nums.length-1; i++){
                if(n > nums[i]){
                    count ++;
                }
            }
            num[index] = count;
            count = 0;
            index++;
        }
        return num;
    }

}
