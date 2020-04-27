package package1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*ArrayList<Gerbil> gerbils=new ArrayList<>();
        for (int i=0;i<6;i++){
            gerbils.add(new Gerbil());
        }
        for (int i=0;i<gerbils.size();i++){
            gerbils.get(i).hop();
        }*/
        /*Set<Integer> set=new HashSet<>();
        for (int i=0;i<4;i++){
            set.add(i);
        }
        for (int i=0;i<6;i++){
            set.add(i);// repeated integer will be ignore
        }
        for (Integer integer:set){
            System.out.println(integer);
        }*/
        /*Sequence sequence=new Sequence();
        for (int i=0;i<6;i++){
            sequence.add(new Integer(i));
        }
        Selector selector=sequence.getSelector();
        while (!selector.end()){
            System.out.print(selector.current()+" ");
            selector.next();
        }*/
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        for (Integer item : collection) {
            System.out.print(item + " ");
        }
        System.out.print("\n");
        Integer[] arr = {10, 20, 30, 40};
        List<Integer> list = Arrays.asList(arr);
        collection.addAll(list);
        for (Integer item : collection) {
            System.out.print(item + " ");
        }
        System.out.print("\n");
        Collections.addAll(collection, arr);
        Collections.addAll(collection, 23, 24, 25, 26);
        for (Integer item:collection){
            System.out.print(item+" ");
        }
        System.out.print("\n");
    }
}

interface Selector {
    boolean end();

    void next();

    Object current();
}

class Sequence {
    private List<Object> list = new ArrayList<>();

    public void add(Object obj) {
        list.add(obj);
    }

    class SequenceSelector implements Selector {
        private int i = 0;

        @Override
        public boolean end() {
            return i == list.size();
        }

        @Override
        public void next() {
            i++;
        }

        @Override
        public Object current() {
            return list.get(i);
        }
    }

    public Selector getSelector() {
        return new SequenceSelector();
    }
}

class Gerbil {
    private static int count = 0;
    private int id = ++count;

    public void hop() {
        System.out.println("Gerbil " + id + " is jumping");
    }
}
