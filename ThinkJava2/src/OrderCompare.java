import com.sun.org.apache.xpath.internal.operations.Or;

public class OrderCompare {
    String s = new String("hello");

    public OrderCompare() {
        System.out.println("Before change: " + s);
        s = new String("lucy");
        System.out.println("After change: " + s);
    }

    public static void main(String[] args) {
        OrderCompare compare = new OrderCompare();
        Lucy lucy1 = new Lucy();
        Lucy lucy2 = new Lucy(25);
    }
}

class Run {
    public Run() {
        System.out.println("Default Run Constructor");
    }

    public Run(int speed) {
        System.out.println("Run speed: " + speed + "m/s");
    }
}

class Lucy extends Run {
    public Lucy() {
        super();
        System.out.println("Default Lucy Constructor");
    }

    public Lucy(int speed) {
        super(speed);
        System.out.println("Lucy speed: " + speed + "km/s");
    }
}
