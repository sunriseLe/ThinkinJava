package package1;

import java.util.Random;

public class Main {
    public static void callCycle(Factory factory) {
        Cycle cycle = factory.getCycle();
        System.out.println(cycle.getWheel() + "");
    }

    public static void playGame(GameFactory factory) {
        Game game = factory.getGame();
        game.play();
        game.play();
        game.play();
        game.play();
    }

    public static void main(String[] args) {
        /*Test1 test1 = new Test1("Value");
        Base base = test1.innerClass();
        base.changeField("New Value");*/
        /*Test2 test2 = new Test2();
        Hello hello = test2.getHello();
        hello.say();*/
        /*Test4 test4=new Test4();
        Test3 test3=test4.getTest3(12);
        test3.print();*/
        /*callCycle(Bicycle.factory);
        callCycle(Tricycle.factory);
        callCycle(Unicycle.factory);*/
        playGame(Coin.factory);
        playGame(Dice.factory);
    }

}

abstract class Base {
    abstract void changeField(String str);
}

class Test1 {
    private String str;

    public Test1(String str) {
        this.str = str;
    }

    private void print() {
        System.out.println("Test1: " + str);
    }

    public Base innerClass() {
        return new Base() {
            public void changeField(String str) {
                Test1.this.str = str;
                print();
            }
        };
    }
}

interface Hello {
    void say();
}

class Test2 {
    public Hello getHello() {
        return new Hello() {
            @Override
            public void say() {
                System.out.println("Hello world ~");
            }
        };
    }
}

class Test3 {
    private int i;

    public Test3(int i) {
        this.i = i;
    }

    public void print() {
        System.out.println("Test3.i: " + i);
    }
}

class Test4 {
    public Test3 getTest3(int i) {
        return new Test3(i) {
            {
                System.out.println("Test3 inner class initializer ... ");
            }
        };
    }
}

interface Cycle {
    int getWheel();
}

interface Factory {
    Cycle getCycle();
}

class Bicycle implements Cycle {
    @Override
    public int getWheel() {
        return 2;
    }

    public static Factory factory = new Factory() {
        @Override
        public Cycle getCycle() {
            return new Bicycle();
        }
    };
}

class Tricycle implements Cycle {
    @Override
    public int getWheel() {
        return 16;
    }

    public static Factory factory = new Factory() {
        @Override
        public Cycle getCycle() {
            return new Tricycle();
        }
    };
}


class Unicycle implements Cycle {
    @Override
    public int getWheel() {
        return 4;
    }

    public static Factory factory = new Factory() {
        @Override
        public Cycle getCycle() {
            return new Unicycle();
        }
    };
}


interface Game {
    void play();
}

interface GameFactory {
    Game getGame();
}

class Coin implements Game {
    private static Random random = new Random();

    @Override
    public void play() {
        int flag = random.nextInt(2);
        if (flag == 0) {
            System.out.println("硬币正面");
        } else {
            System.out.println("硬币反面");
        }
    }

    public static GameFactory factory = new GameFactory() {
        @Override
        public Game getGame() {
            return new Coin();
        }
    };
}

class Dice implements Game {
    private static Random random = new Random();

    @Override
    public void play() {
        int flag = random.nextInt(6);
        switch (flag) {
            case 0:
                System.out.println("1点");
                break;
            case 1:
                System.out.println("2点");
                break;
            case 2:
                System.out.println("3点");
                break;
            case 3:
                System.out.println("4点");
                break;
            case 4:
                System.out.println("5点");
                break;
            case 5:
                System.out.println("6点");
                break;
            default:
                System.out.println("投掷错误，请重新投掷");
        }
    }

    public static GameFactory factory = new GameFactory() {
        @Override
        public Game getGame() {
            return new Dice();
        }
    };
}