package package1;

import com.sun.org.apache.bcel.internal.generic.FADD;

public class FactoryTest {
    public static void callFactory(Factory factory) {
        Cycle cycle = factory.getCycle();
        cycle.ride();
        cycle.sing();
    }

    public static void main(String[] args) {
        /*BicycleFactory bFactory = new BicycleFactory();
        Cycle bicycle = bFactory.getCycle();
        bicycle.ride();
        bicycle.sing();
        TricycleFactory tFactory = new TricycleFactory();
        Cycle tricycle = tFactory.getCycle();
        tricycle.ride();
        tricycle.sing();
        UnicycleFactory uFactory = new UnicycleFactory();
        Cycle unicycle = uFactory.getCycle();
        unicycle.ride();
        unicycle.sing();*/
        callFactory(new BicycleFactory());
        callFactory(new UnicycleFactory());
        callFactory(new TricycleFactory());
    }
}

interface Cycle {
    void ride();

    void sing();
}

class Bicycle implements Cycle {

    @Override
    public void ride() {
        System.out.println("Bicycle ride");
    }

    @Override
    public void sing() {
        System.out.println("ding dang, ding dang ...");
    }
}

class Tricycle implements Cycle {
    @Override
    public void ride() {
        System.out.println("Tricycle ride");
    }

    @Override
    public void sing() {
        System.out.println("wu wu wu ...");
    }
}

class Unicycle implements Cycle {

    @Override
    public void ride() {
        System.out.println("Unicycle ride");
    }

    @Override
    public void sing() {
        System.out.println("di di di ...");
    }
}

interface Factory {
    Cycle getCycle();
}

class BicycleFactory implements Factory {
    @Override
    public Cycle getCycle() {
        return new Bicycle();
    }
}

class TricycleFactory implements Factory {
    @Override
    public Cycle getCycle() {
        return new Tricycle();
    }
}

class UnicycleFactory implements Factory {
    @Override
    public Cycle getCycle() {
        return new Unicycle();
    }
}