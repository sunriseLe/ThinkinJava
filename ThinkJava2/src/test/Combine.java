package test;

public class Combine {
    public static void main(String[] args) {
        Picture pic = new Picture(2);
    }
}

class Color {
    public Color(int i) {
        System.out.println("Color " + i);
    }
}

class Draw extends Color {
    public Draw(int i) {
        super(i);
        System.out.println("Draw " + i);
    }
}

class Picture extends Draw {
    Draw draw = new Draw(1);

    public Picture(int i) {
        super(i);
        System.out.println("Picture " + i);
    }
}