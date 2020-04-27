import java.util.Scanner;

public class NoPure {
    public static void x(Interface1 interface1) {
        interface1.print1();
        interface1.say1();
    }

    public static void y(Interface2 interface2) {
        interface2.print2();
        interface2.say2();
    }

    public static void z(Interface3 interface3) {
        interface3.print3();
        interface3.say3();
    }

    public static void a(Interface4 interface4) {
        interface4.getName();
        interface4.print2();
    }

    public static void main(String[] main) {
        HelloLucy helloLucy = new HelloLucy();
        x(helloLucy);
        y(helloLucy);
        z(helloLucy);
        a(helloLucy);
    }
}

interface Interface1 {
    void print1();

    void say1();
}

interface Interface2 {
    void print2();

    void say2();
}

interface Interface3 {
    void print3();

    void say3();
}

interface Interface4 extends Interface1, Interface2, Interface3 {
    void getName();
}

class Hello {
    @Override
    public String toString() {
        return "Hello class";
    }
}

class HelloLucy extends Hello implements Interface4 {

    @Override
    public void print1() {
        System.out.println("HelloLucy print1");
    }

    @Override
    public void say1() {
        System.out.println("HelloLucy say1");
    }

    @Override
    public void print2() {
        System.out.println("HelloLucy print2");
    }

    @Override
    public void say2() {
        System.out.println("HelloLucy say2");
    }

    @Override
    public void print3() {
        System.out.println("HelloLucy print3");
    }

    @Override
    public void say3() {
        System.out.println("HelloLucy say3");
    }

    @Override
    public void getName() {
        System.out.println("HelloLcuy class");
    }
}