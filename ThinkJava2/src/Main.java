import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import test.Test;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*Exercise1 ex1=new Exercise1();
        ex1.print();
        Exercise2 ex2= new Exercise2("hello lucy~");
        ex2.print();
        House house = new House();
        house.func();
        Dog dog=new Dog();
        // 非基本类型的数组，是引用数组，需要为每个元素新建对象
        String[] strings = new String[10];
        for (int i = 0; i < 10; i++) {
            strings[i] = "strings" + i;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("strings[" + i + "].length: " + strings[i].length());
        }*/
        ArrayTest arrayTest = new ArrayTest(new String[]{"1", "2", "3", "4"});
        Test test=new Test();
        test.main("hello","lucy");
    }
}

class ArrayTest {
    String string;

    ArrayTest(String... s) {
        for (String item : s) {
            System.out.println(item);
        }
    }


}

class Animal {
    String str1 = new String("animal common param");

    static {
        System.out.println("str2 is already initialized");
    }

    Animal() {
        System.out.println("animal constructor, str1: " + str1 +
                ", str2: " + str2);
    }

    static String str2 = new String("animal static param");

    {
        System.out.println("str1 is already initialized");
    }
}

class Dog extends Animal {
    static String dog1 = new String("dog1");
    String dog2 = new String("dog2");

    static {
        System.out.println("dog1 is already initialized");
    }

    {
        System.out.println("dog2 is already initialized");
    }

    Dog() {
        System.out.println("dog constructor, " + dog1 +
                ", " + dog2);
    }
}

class Window {
    Window(int marker) {
        System.out.println("Window(" + marker + ")");
    }
}

class House {
    Window w1 = new Window(1);

    House() {
        w3 = new Window(30);
    }

    Window w2 = new Window(2);

    void func() {
        System.out.println("This is func()");
    }

    Window w3 = new Window(3);
}


class Exercise1 {
    String string;
    static String hello;

    public void print() {
        System.out.println(string);
    }

    public static void hello() {
        System.out.println(hello);
        bark("1", "3");
    }

    public static void bark(String str1, String str2) {
        System.out.println(str1 + ", " + str2);
        System.out.println(hello);
        hello();
    }
}

class Exercise2 {
    String string1 = "1234";
    String string2;

    Exercise2(String string) {
        this.string2 = string;
    }

    public void print() {
        System.out.println("str1: " + string1 + "; " + "str2: " + string2);
    }
}
