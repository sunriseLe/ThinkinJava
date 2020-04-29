package package2;

import java.util.Iterator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*for (Map.Entry<String,String> entry:System.getenv().entrySet()){
            System.out.println(entry.getKey()+" ----- "+entry.getValue());
        }*/
        MyShape myShape=new MyShape(12);
        for (Shape shape:myShape){
            shape.draw();
            shape.erase();
        }
    }
}

class MyShape implements Iterable<Shape> {
    private Shape[] shapes;
    private Random random = new Random();

    private Shape generateShape() {
        int flag = random.nextInt(3);
        switch (flag) {
            case 0:
                return new Circle();
            case 1:
                return new Triangle();
            case 2:
                return new Square();
            default:
                return null;
        }
    }

    public MyShape(int n) {
        shapes=new Shape[n];
        for (int i = 0; i < n; i++) {
            shapes[i] = generateShape();
        }
    }

    @Override
    public Iterator<Shape> iterator() {
        return new Iterator<Shape>() {
            int index=0;
            @Override
            public boolean hasNext() {
                return index<shapes.length;
            }

            @Override
            public Shape next() {
                return shapes[index++];
            }
        };
    }
}

class Shape {
    void draw() {
    }

    void erase() {
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Circle draw");
    }

    @Override
    void erase() {
        System.out.println("Circle erase");
    }
}

class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Triangle draw");
    }

    @Override
    void erase() {
        System.out.println("Triangle erase");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Square draw");
    }

    @Override
    void erase() {
        System.out.println("Square erase");
    }
}
