package package2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*MyStack<String> stack=new MyStack<>();
        for (String str:"Hello lucy good morning good afternoon".split(" ")){
            stack.push(str);
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
        System.out.print("\n");*/
        /*String str="+U+n+c---+e+r+t---+a-+i-+n+t+y---+-+r+u--" +
                "+l+e+s---";
        MyStack<Character> stack=new MyStack<>();
        char[] arr=str.toCharArray();
        for (int i=0;i<arr.length;){
            if (arr[i]=='+'){
                stack.push(arr[++i]);
                i++;
            }else if (arr[i]=='-'){
                System.out.print(stack.pop());
                i++;
            }
        }
        System.out.print("\n");*/
        /*testSet1();*/
        List<Integer> result=totalCount(readFile());
        int sum=0;
        for (Integer item:result){
            System.out.print(item+" ");
            sum+=item;
        }
        System.out.print("\ntotal count: "+sum);
    }

    public static List<Integer> totalCount(List<String> list){
        List<Integer> result=new ArrayList<>();
        Set<Character> set=new HashSet<>(Arrays.asList('a','e','i','o','u'));
        for (String item:list){
            String[] strings=item.split(" ");
            for (String str:strings){
                int count=0;
                char[] chars=str.toCharArray();
                for (int i=0;i<chars.length;i++){
                    if (set.contains(chars[i])){
                        count++;
                    }
                }
                result.add(count);
            }
        }
        return result;
    }
    public static List<String> readFile(){
        List<String> list=new ArrayList<>();
        try {
            FileReader fr = new FileReader("Test");
            BufferedReader bf = new BufferedReader(fr);
            String str;
            // 按行读取字符串
            while ((str = bf.readLine()) != null) {
                list.add(str);
            }
            bf.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    // set use hashCode and equal can not affect it
    public static void testSet1() {
        Set<Hello> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(new Hello(i));
        }
        for (int i = 5; i < 10; i++) {
            set.add(new Hello(i));
        }
        for (Hello hello : set) {
            System.out.println(hello);
        }
        System.out.println(new Hello(5).equals(new Hello(5)));
    }
}

class Hello {
    private int i;

    Hello(int i) {
        this.i = i;
    }

    public String toString() {
        return "Hello " + i;
    }

    public boolean equals(Object obj){
        if (obj instanceof Hello){
            return ((Hello) obj).i == this.i;
        }
        return false;
    }

    /*@Override
    public int hashCode() {
        return ((Integer)this.i).hashCode();
    }*/
}

class MyStack<T> {
    private LinkedList<T> stack = new LinkedList<>();

    public void push(T item) {
        stack.addFirst(item);
    }

    public T peek() {
        return stack.getFirst();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public String toString() {
        return stack.toString();
    }

    public T pop() {
        return stack.removeFirst();
    }
}
