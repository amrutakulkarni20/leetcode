package LeetCode;

public class MyClass{

//    public static void someMethod(String name) throws CustomException {
//        if(name.equalsIgnoreCase("Amruta")){
//            throw new CustomException("Invalid String");
//        }
//        System.out.println("Code is working fine");
//    }

    public static int divide(int a, int b){
        int c = a/b;
        if(c == 0){
           throw new ArithmeticException();
        }
        return c;
    }

    public static void main(String args []) {
        //someMethod("Amruta"); 
        try {
            divide(3,0);
        }catch (ArithmeticException a){
            System.out.println("Arithmatic exception");
        }

    }

}
