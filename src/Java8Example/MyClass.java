package Java8Example;

public class MyClass implements MyInterface{
    @Override
    public void abstractMethod() {

    }

    @Override
    public void defaultMethod() {
        MyInterface.super.defaultMethod();
    }

    public void staticMethod(){
        MyInterface.staticMethod();
    }
}
