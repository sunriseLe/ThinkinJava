package package1;

import java.util.*;

public class Main {
    public static List createList(int length) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            list.add(random.nextInt(50));
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> orgin=createList(8);
        Integer[] arr={1,2,3,4,5};
        System.out.println(orgin);
        for (Integer item:arr){
            ListIterator<Integer> iterator=orgin.listIterator(orgin.size()/2);
            iterator.add(item);
            System.out.println(orgin);
        }
    }

    public static void testListIterator(){
        List<Integer> list1 = createList(8);
        List<Integer> list2 = createList(8);
        System.out.println("list1: " + list1);
        ListIterator<Integer> iterator = list1.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + ", " + iterator.nextIndex() + ", "
                    + iterator.previousIndex());
        }
        // use previous to implement inverted sequence
        List<Integer> copy1= new ArrayList<>(list2);
        while (iterator.hasPrevious()){
            copy1.add((Integer)iterator.previous());
        }
        System.out.println("copy1: "+copy1);
        // sequential traversal but add param  at head
        List<Integer> copy2=new ArrayList<>(list2);
        for (Integer item:list1){
            copy2.add(8,item);
        }
        System.out.println("copy2: "+copy2);
        // inverted traversal and add param at tail
        List<Integer> copy3=new ArrayList<>(list2);
        for(int i=7;i>=0;i--){
            copy3.add(list1.get(i));
        }
        System.out.println("copy3: "+copy3);
        System.out.println("list2: "+list2);
    }
}
