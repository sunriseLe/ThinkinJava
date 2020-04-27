package package3;

public class Main {
    public static void main(String[] args) {
        /*B b = new B(5);
        A a = new A();
        b.add(a.getU());
        b.add(a.getU());
        b.add(a.getU());
        b.add(a.getU());
        b.add(a.getU());
        b.arr[0].play();
        b.arr[1].say("Hello lucy");
        b.arr[4].print();
        b.clear(3);
        //b.arr[3].play();*/
    }
}

class Outer1{
    class OInner1{
        OInner1(String str){
            System.out.println(str);
        }
    }
}

class Outer2 extends Outer1.OInner1{
    Outer2(Outer1 outer1){
        outer1.super("hello");
        System.out.println("Outer2 class");
    }

    public static void main(String[] args){
        Outer1 outer1=new Outer1();
        Outer2 outer2=new Outer2(outer1);
    }

}

interface Base1 {
    void print();

    class Base1Impl implements Base1 {
        @Override
        public void print() {
            System.out.println("Base1Impl1");
        }

        public static void main(String[] args) {
            Base1Impl impl = new Base1Impl();
            impl.print();
        }
    }
}

interface U {
    void say(String str);

    void print();

    void play();
}

class A {
    static int i = 0;

    A() {
        i++;
        System.out.println("A " + i);
    }

    U getU() {
        return new U() {
            @Override
            public void say(String str) {
                System.out.println(str);
            }

            @Override
            public void print() {
                System.out.println("Anonymous Class");
            }

            @Override
            public void play() {
                System.out.println("Let's play");
            }
        };
    }
}

class B {
    U[] arr;
    private int i = 0;

    B(int len) {
        arr = new U[len];
    }

    void add(U u) {
        if (i < arr.length) {
            arr[i++] = u;
        }
    }

    void clear(int index) {
        if (index >= 0 && index < arr.length) {
            arr[index] = null;
        }
    }

    void reverse() {
        for (int item = 0; item < arr.length; item++) {
            System.out.println("arr[" + item + "]: " + arr[item]);
        }
    }
}

interface Base2 {
    String printI();

    String printJ();

    class TestNested {
        static void print(Base2 base2) {
            System.out.println(base2.printI() + "\n" + base2.printJ());
        }
    }
}

class Base2Impl implements Base2 {
    @Override
    public String printI() {
        return "ai ai ai ...";
    }

    @Override
    public String printJ() {
        return "ji ji ji ...";
    }

    public static void main(String[] args) {
        Base2Impl impl = new Base2Impl();
        Base2.TestNested.print(impl);
    }
}
