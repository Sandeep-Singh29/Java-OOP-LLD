package inheritance;

/**
 * Author: Sandeep Singh
 * Date: 11/06/25
 */

class A {
    void m1() throws ArrayIndexOutOfBoundsException{
        System.out.println("Called m1 A");
    }
}

class B extends A {

    @Override
    void m1() throws IndexOutOfBoundsException {
        System.out.println("Called m1 B");
    }

    void m2() {
        System.out.println("Called m2 B");
    }

}

public class TestCase {

    public static void main(String[] args) {
        A a = new B();
       // a.m2(); //compile time error
        a.m1(); // Called m1 B

    }
}
