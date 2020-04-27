package test;

public class ConstructorTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle("lucy");
        System.out.println(triangle);
    }
}

class Line {
    Line(String s) {
        System.out.println("Line Constructor " + s);
    }
}

class Shape extends Line {
    Shape(String s) {
        super(s);
        System.out.println("Shape Constructor " + s);
    }
}

class Triangle extends Shape {
    Triangle(String s) {
        super(s);
    }

    public String toString() {
        return "Triangle";
    }
}
