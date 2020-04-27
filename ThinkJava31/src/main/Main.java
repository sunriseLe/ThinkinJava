package main;

public class Main {
    public static void main(String[] args) {
        /*LongAdd add=new LongAdd();
        System.out.println("Int add: "+add.add(1,4));
        System.out.println("Float add: "+add.add(1.2f,2.5f));
        System.out.println("Double add: "+add.add(2.3,1.2));
        System.out.println("Long add: "+add.add(1200l,23456l));
        Add add = new Add();
        add.print("call now");
        LongAdd longAdd = new LongAdd();
        System.out.println(longAdd.add(190444l, 13342554l));
        Frog frog=new Frog();
        frog.upcasting(frog);*/
        CommonCake commonCake = new CommonCake();
        commonCake.getFinalParam(new Cake("jack", 10), 9);
    }
}

class Cake {
    int size;
    String name;

    public Cake(String name, int size) {
        this.size = size;
        this.name = name;
    }
}

class CommonCake {
    public void getFinalParam(final Cake cake, final int i) {
        System.out.println("cake name: " + cake.name + ", size: " +
                cake.size + ", i: " + i);
        cake.name = "lili";
        System.out.println("cake name: " + cake.name + ", size: " +
                cake.size + ", i: " + i);
    }
}

class BirthCake {
    private final Cake cake;
    private final int i;
    private static final String date = "2020-4-21";

    public BirthCake(String name, int size, int i) {
        cake = new Cake(name, size);
        this.i = i;
        System.out.println("Make an birthday cake");
    }

    public String toString() {
        return "name: " + cake.name + ", size: " + cake.size +
                ", date: " + date + ", i: " + i;
    }

    public static void main(String[] args) {
        BirthCake birthCake1 = new BirthCake("lucy", 12, 18);
        System.out.println(birthCake1.toString());
        birthCake1.cake.name = "grace";
        System.out.println(birthCake1.toString());
        BirthCake birthCake2 = new BirthCake("lucy", 8, 25);
        System.out.println(birthCake2.toString());
    }
}

class Add {
    public int add(int i, int j) {
        return i + j;
    }

    public float add(float i, float j) {
        return i + j;
    }

    public double add(double i, double j) {
        return i + j;
    }

    protected void print(String msg) {
        System.out.println("Add " + msg);
    }
}

class LongAdd extends Add {
    public long add(long i, long j) {
        print("LongAdd call now");
        return i + j;
    }
}

class Amphibian {
    public void upcasting(Amphibian amphibian) {
        System.out.println("Amphibian");
        System.out.println(amphibian);
    }
}

class Frog extends Amphibian {
    public void printFrog() {
        System.out.println("Frog class");
    }

    public void upcasting(Frog frog) {
        System.out.println("Frog");
        System.out.println(frog);
    }
}