package package1;

import java.util.Random;

public class GameFactory {
    public static void play(Factory1 factory) {
        Game game = factory.getGame();
        game.play();
    }

    public static void main(String[] args) {
        CoinFactory coinFactory = new CoinFactory();
        play(coinFactory);
        play(coinFactory);
        play(coinFactory);
        play(coinFactory);
        DiceFactory diceFactory = new DiceFactory();
        play(diceFactory);
        play(diceFactory);
        play(diceFactory);
        play(diceFactory);
    }
}

interface Game {
    void play();
}

class Coin implements Game {
    private static Random random = new Random();

    @Override
    public void play() {
        int result = random.nextInt(2);
        if (result == 0) {
            System.out.println("硬币正面");
        } else {
            System.out.println("硬币反面");
        }
    }
}

class Dice implements Game {
    private static Random random = new Random();

    @Override
    public void play() {
        int flag = random.nextInt(6);
        switch (flag) {
            case 0:
                System.out.println("点数为1");
                break;
            case 1:
                System.out.println("点数为2");
                break;
            case 2:
                System.out.println("点数为3");
                break;
            case 3:
                System.out.println("点数为4");
                break;
            case 4:
                System.out.println("点数为5");
                break;
            case 5:
                System.out.println("点数为6");
                break;
            default:
                System.out.println("点数错误");
        }
    }
}

interface Factory1 {
    Game getGame();
}

class DiceFactory implements Factory1 {
    @Override
    public Game getGame() {
        return new Dice();
    }
}

class CoinFactory implements Factory1 {
    @Override
    public Game getGame() {
        return new Coin();
    }
}