package interfacePackage;

public class Main {
    public static void testPrint(Animal animal) {
        animal.print();
    }

    public static void main(String[] args) {
        /*Gerbil gerbil = new Gerbil() {
            @Override
            public void live() {
                System.out.println("匿名类");
            }
        };
        gerbil.live();
        Square square = new Square();
        square.print();*/
        testPrint(new Cat());
    }
}


abstract class Animal {
    abstract public void print();
}

class Cat extends Animal {
    public void print() {
        System.out.println("Cat print ...");
    }
}

abstract class Shape {
    public Shape() {
        System.out.println("Shape constructor");
        // 父类构造器调用之前，并为初始化子类的示例变量，因此为默认值
        print();
    }

    public abstract void print();
}

class Square extends Shape {
    private int i = 10;

    public Square() {
        System.out.println("Square constructor, i = " + i);
    }

    @Override
    public void print() {
        System.out.println("Square.i = " + i);
    }
}

abstract class Rodent {
    public abstract void live();

    public String toString() {
        return "Rodent";
    }
}

class Mouse extends Rodent {
    @Override
    public void live() {
        System.out.println("老鼠生活在田野里");
    }

    public String toString() {
        return "Mouse";
    }
}

abstract class Gerbil extends Rodent {
    public String toString() {
        return "Gerbil";
    }
}
