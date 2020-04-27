package slave;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal(10);
        System.out.println(animal.toString());
        Triangle triangle = new Triangle();
        triangle.finalMethod();
    }
}

class Base {
    public void func() {
        System.out.println("Base.func()");
    }
}

class Child extends Base {
    @Override
    public void func() {
        System.out.println("Child.func()");
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.func();
        Base base = new Base();
        base.func();
    }
}

final class Animal {
    int i;
    final String str = "animal";

    public Animal(int i) {
        this.i = i;
    }

    public String toString() {
        return str + " " + i;
    }
}

class Shape {
    static int i = 10;

    static {
        System.out.println("Shape static statements");
    }

    public Shape() {
        System.out.println("Shape constructor, i: " + i);
    }

    public final void finalMethod() {
        System.out.println("Shape.finalMethod()");
    }
}

class Line extends Shape {
    static int start = 12;

    static {
        System.out.println("Line static statements");
    }

    public Line() {
        System.out.println("Line constructor, start: " + start);
    }
}

class Triangle extends Line {
    static int length = 24;

    static {
        System.out.println("Triangle static statements");
    }

    public Triangle() {
        System.out.println("Shape constructor, length: " + length);
    }
}
