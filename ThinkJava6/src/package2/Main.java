package package2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*List<Car> list1= Arrays.asList(new SmallCar(),new BigCar(),new SmallCar1());
        List<Car> list2=Arrays.asList(new SmallCar1(),new SmallCar2());
        List<Car> list3=new ArrayList<>();
        Collections.addAll(list3,new SmallCar2(),new SmallCar1());
        List<Car> list4=Arrays.<Car>asList(new SmallCar2(),new SmallCar1());*/
        /*printCollection();*/
        /*Random random = new Random(30);
        List<Cycle> cycles=new ArrayList<>();
        cycles.add(new Cycle(random.nextInt(24)));
        cycles.add(new Cycle(random.nextInt(24)));
        cycles.add(new Cycle(random.nextInt(24)));
        for (Cycle cycle:cycles){
            System.out.println(cycle.getWheel());
        }
        System.out.println(cycles.contains(new Cycle(5)));*/
        /*Random random = new Random(30);
        List<Integer> cycles=new ArrayList<>();
        cycles.add(new Integer(random.nextInt(24)));
        cycles.add(new Integer(random.nextInt(24)));
        cycles.add(new Integer(random.nextInt(24)));
        for (Integer cycle:cycles){
            System.out.println(cycle);
        }
        Cycle cycle1=new Cycle(3);
        Cycle cycle2=new Cycle(3);
        System.out.println(cycle1==cycle2);
        System.out.println(cycle1.equals(cycle2));
        System.out.println(cycles.contains(new Integer(5)));*/
    }

    public static void testList(){
        Random random = new Random();
        List<Integer> integers = arrayList(8, 100);
        System.out.println("1: " + integers);
        Integer integer1 = new Integer(random.nextInt(100));
        integers.add(integer1);
        System.out.println("2: " + integers);
        System.out.println("3: " + integers.contains(integer1));
        integers.remove(integer1);
        Integer integer2 = integers.get(2);
        System.out.println("4: " + integer2 + " " + integers.indexOf(integer2));
        Integer integer3 = new Integer(random.nextInt(100));
        System.out.println("5: " + integers.indexOf(integer3));
        System.out.println("6: " + integers.remove(integer3));
        System.out.println("7: " + integers.indexOf(integer2));
        System.out.println("8: " + integer1.compareTo(integer2));
        integers.add(3, random.nextInt(100));
        System.out.println("9: " + integers);
        List<Integer> sub = integers.subList(1, 4);
        System.out.println("subList: " + sub);
        System.out.println("10: " + integers.containsAll(sub));
        Collections.sort(sub);
        System.out.println("sorted subList: " + sub);
        System.out.println("11: " + integers.containsAll(sub));
        Collections.shuffle(sub, random);
        System.out.println("shuffled subList: " + sub);
        System.out.println("12: " + integers.containsAll(sub));
        List<Integer> copy = new ArrayList<>(integers);
        sub = Arrays.asList(integers.get(1), integers.get(4));
        System.out.println("sub: " + sub);
        copy.retainAll(sub);
        System.out.println("13: " + copy);
        copy = new ArrayList<>(integers);
        copy.remove(2);
        System.out.println("14: " + copy);
        copy.removeAll(sub);
        System.out.println("15: " + copy);
        copy.set(1,random.nextInt(100));
        System.out.println("16: " + copy);
        copy.addAll(2,sub);
        System.out.println("17: " + copy);
        System.out.println("18: "+integers.isEmpty());
        integers.clear();
        System.out.println("19: " + integers);
        System.out.println("20: " + integers.isEmpty());
        integers.addAll(arrayList(4,100));
        System.out.println("21: " + integers);
        Object[] objects=integers.toArray();
        System.out.println("22: " + objects[3]);
    }

    public static List<Integer> arrayList(int lenght, int bound) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < lenght; i++) {
            list.add(random.nextInt(bound));
        }
        return list;
    }

    public static void printCollection() {
        List<String> list1 = new ArrayList<>();
        Generator generator1 = new Generator();
        for (int i = 0; i < 12; i++) {
            list1.add(generator1.next());
        }
        List<String> list2 = new LinkedList<>();
        Generator generator2 = new Generator();
        for (int i = 0; i < 12; i++) {
            list2.add(generator2.next());
        }
        Set<String> set1 = new HashSet<>();
        Generator generator3 = new Generator();
        for (int i = 0; i < 12; i++) {
            set1.add(generator3.next());
        }
        Set<String> set2 = new TreeSet<>();
        Generator generator4 = new Generator();
        for (int i = 0; i < 12; i++) {
            set2.add(generator4.next());
        }
        Set<String> set3 = new LinkedHashSet<>();
        Generator generator5 = new Generator();
        for (int i = 0; i < 12; i++) {
            set3.add(generator5.next());
        }
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);
    }
}

class Cycle{
    private int wheel;
    public Cycle(int wheel){
        this.wheel=wheel;
    }

    public int getWheel(){
        return wheel;
    }

    public void setWheel(int wheel){
        this.wheel=wheel;
    }

    public boolean equals(Object obj){
        if (obj instanceof Cycle){
            return this.wheel==((Cycle) obj).wheel;
        }
        return false;
    }
}

class Generator {
    private static String[] strings = {"Harry Potter", "Snow White", "Ring King",
            "Star", "Iron Man", "Batman", "Clown", "Black Widow"};
    private int i = 0;

    public String next() {
        return strings[(i++) % 8];
    }
}

class Car {
}

class SmallCar extends Car {
}

class BigCar extends Car {
}

class SmallCar1 extends SmallCar {
}

class SmallCar2 extends SmallCar {
}
