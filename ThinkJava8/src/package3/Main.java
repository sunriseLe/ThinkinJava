package package3;

import java.util.*;

public class Main {
    public static void main(String[] args){
        CollectionSequence sequence=new CollectionSequence();
        for (Pet pet:sequence.pets){
            System.out.print(pet + " ");
        }
        System.out.print("\n");
        for (Pet pet:sequence.reversed()){
            System.out.print(pet +" ");
        }
        System.out.print("\n");
        for (Pet pet:sequence.randomized()){
            System.out.print(pet+" ");
        }
        System.out.print("\n");
    }
}

class CollectionSequence implements Iterable{
     Pet[] pets=Pet.generate(15);
    @Override
    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index=0;
            @Override
            public boolean hasNext() {
                return index<pets.length;
            }

            @Override
            public Pet next() {
                return pets[index++];
            }
        };
    }
    public Iterable<Pet> reversed(){
        return new Iterable<Pet>() {
            @Override
            public Iterator<Pet> iterator() {
                return new Iterator<Pet>() {
                    private int index=pets.length-1;
                    @Override
                    public boolean hasNext() {
                        return index>=0;
                    }

                    @Override
                    public Pet next() {
                        return pets[index--];
                    }
                };
            }
        };
    }

    public Iterable<Pet> randomized(){
        return new Iterable<Pet>() {
            @Override
            public Iterator<Pet> iterator() {
                List<Pet> list=new ArrayList<>(Arrays.asList(pets));
                Collections.shuffle(list,new Random());
                return list.iterator();
            }
        };
    }
}

class Pet{
    private static Random random=new Random();
    private int number;
    public Pet(int number){
        this.number=number;
    }
    public static Pet[] generate(int n){
        Pet[] pets=new Pet[n];
        for (int i=0;i<n;i++){
            pets[i]=new Pet(random.nextInt(20));
        }
        return pets;
    }

    @Override
    public String toString() {
        return "Pet "+number;
    }
}
