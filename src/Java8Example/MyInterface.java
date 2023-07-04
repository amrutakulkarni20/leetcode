package Java8Example;

public interface MyInterface {
    // Abstract method
    void abstractMethod();

    // Static method
    static void staticMethod() {
        System.out.println("This is a static method in the interface.");
    }

    // Default method
    default void defaultMethod() {
        System.out.println("This is a default method in the interface.");
    }
}
