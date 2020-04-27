package package1;

import javafx.beans.binding.ObjectExpression;

public class InnerClass {
    public static void main(String[] args) {
        /*Outer outer = new Outer("hello lili");
        Outer.Inner inner = outer.inner("Inner class 1");
        inner.print();
        inner.name = "Inner class 2";
        inner.print();
        System.out.println(inner.toString());*/
        /*Sequence sequence=new Sequence(3);
        sequence.addItem(new MyString("hello lucy"));
        sequence.addItem(new MyString("wu wu wu ..."));
        sequence.addItem(new MyString("di di di ..."));
        Selector selector=sequence.getSelector();
        System.out.println(selector.current().toString());
        selector.next();
        System.out.println("end of item "+selector.end());*/
        /*Sequence sequence=new Sequence(3);
        sequence.addItem("hello");
        sequence.addItem("lucy");
        Sequence.SequenceSelector selector=sequence.new SequenceSelector();
        Sequence sequence1=selector.getSequence();
        sequence.addItem("world");
        selector.next();
        selector.next();
        System.out.println(selector.current().toString());*/
    }
}

class Outer {
    private String str;
    public Outer(String str){
        this.str=str;
    }

    public String func(){
        return str;
    }
    public class Inner {
        public String name;

        public Inner(String name) {
            this.name = name;
        }

        public void print() {
            System.out.println(name);
        }

        @Override
        public String toString() {
            return str;
        }
    }

    public Inner inner(String name) {
        return new Inner(name);
    }
}

interface Selector {
    void next();

    boolean end();

    Object current();
}

class Sequence {
    private Object[] items;
    private int next = 0;

    // initialise array
    public Sequence(int size) {
        items = new Object[size];
    }

    // add value into array
    public void addItem(Object x) {
        if (next < items.length) {
            items[next++] = x;
        }
    }

    protected class SequenceSelector implements Selector {
        private int i = 0;// array index

        @Override
        public void next() {
            if (i < items.length) {
                i++;
            }
        }

        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        public Sequence getSequence(){
            return Sequence.this;
        }
    }

    public Selector getSelector(){
        return new SequenceSelector();
    }
}

class MyString{
    private String str;
    public MyString(String str){
        this.str=str;
    }
    public String toString(){
        return str;
    }
}

