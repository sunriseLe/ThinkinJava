package test;

public class Test {
    public static void main(String... args) {
        /*for (String arg : args) {
            System.out.println(arg);
        }
        for (Animal type:Animal.values()){
            System.out.println("type: "+type.name()+", ordinal: "+type.ordinal());
        }
        PrintAnimal cat=new PrintAnimal(Animal.CAT);
        cat.printName();*/

    }
}

enum Animal {
    DOG, CAT, ANT, BIRD, FISH
}

class PrintAnimal {
    Animal type;

    PrintAnimal(Animal type) {
        this.type = type;
    }

    public void printName() {
        switch (type) {
            case ANT:
                System.out.println("This is ant");
                break;
            case CAT:
                System.out.println("This is cat");
                break;
            case DOG:
                System.out.println("This is dog");
                break;
            case BIRD:
                System.out.println("This is bird");
                break;
            case FISH:
                System.out.println("This is fish");
                break;
            default:
                System.out.println("Unknown animal");
        }
    }
}