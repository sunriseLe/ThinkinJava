import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*Cycle[] cycles = new Cycle[6];
        Random random = new Random(30);
        for (int i = 0; i < 6; i++) {
            int index = random.nextInt(3);
            switch (index) {
                case 0:
                    cycles[i] = new Unicycle();
                    break;
                case 1:
                    cycles[i] = new Bicycle();
                    break;
                case 2:
                    cycles[i] = new Tricycle();
                    break;
                default:
                    System.out.println("Unknown type");
            }
        }
        for (Cycle cycle : cycles) {
            cycle.ride();
            cycle.print();
        }
        BaseStatic baseStatic = new ChildStatic("lucy");
        System.out.println(baseStatic.dynamicName());
        System.out.println(baseStatic.staticName());
        Shared shared1 = new Shared();
        Shared shared2 = new Shared();
        UseShared[] useShareds = {new UseShared(shared1), new UseShared(shared2),
                new UseShared(shared2), new UseShared(shared2), new UseShared(shared1)};
        for (UseShared useShared : useShareds) {
            useShared.dispose();
        }*/
        Cycle[] cycles={new Tricycle(),new Bicycle(),new Unicycle(),new Cycle()};
        ((Tricycle)cycles[0]).balance();
        ((Bicycle)cycles[1]).balance();
        ((Unicycle)cycles[2]).balance();
        // ((Unicycle)cycles[3]).balance();
    }

}

class Shared {
    // count all  objects number
    private static int count = 0;
    private long refCount = 0;
    private final long id = ++count;

    public Shared() {
        System.out.println("Create shared object " + id);
    }

    public void addRef() {
        refCount++;
    }

    public void dispose() {
        if (--refCount == 0) {
            System.out.println("Dispose shared object " + id);
        }
    }
}

class UseShared {
    private Shared shared;
    private static long count = 0;
    private final long id = ++count;

    public UseShared(Shared shared) {
        this.shared = shared;
        this.shared.addRef();// add reference count
        System.out.println("Create useShared object " + id);
    }

    public void dispose() {
        System.out.println("Dispose useShared object " + id);
        this.shared.dispose();
    }
}

class BaseStatic {
    Cycle cycle = new Cycle();

    BaseStatic() {
        System.out.println("BaseStatic");
    }

    public static String staticName() {
        return "Base static method";
    }

    public String dynamicName() {
        return "Base dynamic method";
    }
}

class ChildStatic extends BaseStatic{
    Cycle cycle = new Cycle();

    public ChildStatic(String msg) {
        System.out.println("ChildStatic " + msg);
    }

    public static String staticName() {
        return "Child static method";
    }

    @Override
    public String dynamicName() {
        return "Child dynamic method";
    }
}

class Cycle {
    public Cycle() {
        System.out.println("Cycle class");
    }

    public void ride() {
        System.out.println("Cycle ride");
    }

    public void print() {
        System.out.println("Cycle class");
    }
}

class Unicycle extends Cycle {
    public Unicycle(){
        System.out.println("Unicycle class");
    }
    @Override
    public void ride() {
        System.out.println("Unicycle ride");
    }
    public void balance(){
        System.out.println("Unicycle balance");
    }
}

class Bicycle extends Cycle {
    public Bicycle(){
        System.out.println("Bicycle class");
    }
    @Override
    public void ride() {
        System.out.println("Bicycle ride");
    }

    @Override
    public void print() {
        System.out.println("Bicycle class");
    }
    public void balance(){
        System.out.println("Bicycle balance");
    }
}

class Tricycle extends Cycle {
    public Tricycle(){
        System.out.println("Tricycle class");
    }
    @Override
    public void ride() {
        System.out.println("Tricycle ride");
    }
    public void balance(){
        System.out.println("Tricycle balance");
    }
}