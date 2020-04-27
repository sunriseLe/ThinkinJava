package package3;

import java.util.BitSet;

public class Main {
    public Destination getDestination(String str) {
        class MyDestination implements Destination {
            private String label;

            public MyDestination(String label) {
                this.label = label;
            }

            @Override
            public String destination() {
                return label;
            }
        }
        return new MyDestination(str);
    }

    public Destination selectDestination(int flag, String str) {
        if (flag == 1) {
            class Destination1 implements Destination {
                private String label;

                public Destination1(String str) {
                    this.label = str;
                }

                @Override
                public String destination() {
                    return label;
                }
            }
            return new Destination1(str);
        }
        System.out.println("Unknown flag");
        return null;
    }

    public static void main(String[] args) {
        /*Main main = new Main();
        Destination destination = main.getDestination("Shanghai");
        System.out.println("destination: " + destination.destination());*/
        /*Main main = new Main();
        Destination destination = main.selectDestination(1, "Beijing");
        System.out.println("destination: " + destination.destination());*/
        Test test=new Test();
        Cycle cycle=test.getCycle();
        System.out.println("Bicycle wheel: " + cycle.getWheel());
    }
}

interface Destination {
    String destination();
}

class Test{
    private class Bicycle implements Cycle {
        @Override
        public int getWheel() {
            return 2;
        }
    }

    public Cycle getCycle() {
        return new Bicycle();
    }
}


