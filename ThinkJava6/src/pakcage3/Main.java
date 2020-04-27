package pakcage3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*List<Gerbil> gerbils=new ArrayList<>();
        gerbils.add(new Gerbil());
        gerbils.add(new Gerbil());
        gerbils.add(new Gerbil());
        gerbils.add(new Gerbil());
        gerbils.add(new Gerbil());
        Iterator<Gerbil> iterator=gerbils.iterator();
        while (iterator.hasNext()){
            iterator.next().hop();
        }*/
        /*Sequence sequence = new Sequence();
        sequence.add(new Gerbil());
        sequence.add(new Gerbil());
        sequence.add(new Gerbil());
        sequence.add(new Gerbil());
        Iterator<Gerbil> iterator=sequence.getIterator();
        while (iterator.hasNext()){
            iterator.next().hop();
        }*/
        List<Integer> list1=new ArrayList<>(Arrays.asList(1,2,3,4));
        List<Character> list2=new LinkedList<>(Arrays.asList('a','b','c'));
        Set<Float> set1=new HashSet<>(Arrays.asList(12.3f,23.4f,1.2f,2.4f));
        Set<Double> set2=new TreeSet<>(Arrays.asList(1.2,2.3,3.5,4.8));
        Set<Long> set3=new LinkedHashSet<>(Arrays.asList(123456l,34563457l,47645847l));
        reverse(list1);
        reverse(list2);
        reverse(set1);
        reverse(set2);
        reverse(set3);
    }

    public static void reverse(Collection collection){
        Iterator iterator=collection.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.print("\n");
    }

}

class Sequence {
    private List<Gerbil> gerbils = new ArrayList<>();

    public void add(Gerbil gerbil) {
        gerbils.add(gerbil);
    }

    public Iterator getIterator() {
        return gerbils.iterator();
    }
}

class Gerbil {
    private static int count = 0;
    private int id = count++;

    public void hop() {
        System.out.println("Gerbil " + id + " jumping");
    }
}
