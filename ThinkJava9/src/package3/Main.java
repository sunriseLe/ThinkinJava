package package3;

import java.io.StringWriter;
import java.util.Random;

public class Main {
    public static void throwException(int flag) throws Exception1, Exception2, Exception3 {
        switch (flag) {
            case 1:
                throw new Exception1("Exception1");
            case 2:
                throw new Exception2("Exception2");
            case 3:
                throw new Exception3("Exception3");
            default:
                System.out.println("Unknown error");
        }
    }

    public static void g() throws Exception1 {
        throw new Exception1("Exception1 from g()");
    }

    public static void f() throws RuntimeException {
        try {
            g();
        } catch (Exception1 exception1) {
            exception1.printStackTrace();
            /*throw new Exception2("Exception2 from f()");*/
            throw new RuntimeException(exception1);
        }
    }

    public static void main(String[] args) {
        /*try {
            throwException(3);
        } catch (Exception e){
            e.printStackTrace();
        }*/
        /*try {
            f();
        } catch (RuntimeException exception2) {
            exception2.printStackTrace();
        }*/
        /*Random random=new Random();
        Sequence sequence=new Sequence();
        for (int i=0;i<9;i++){
            try{
                sequence.add(random.nextInt(20));
            }catch (ArrayIndexOutOfBoundsException e){
                e.printStackTrace();
            }
        }
        Selector selector=sequence.getSelector();
        while (selector.hasNext()){
            System.out.print(selector.next()+" ");
        }*/
        int count = 0;
        Random random = new Random();
        while (true) {
            try {
                selectExpetion(random.nextInt(3));
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                count++;
                System.out.println("throw Exception " + count + " times");
                if (count == 8) {
                    break;
                }
            }
        }
    }

    public static void selectExpetion(int flag) throws Exception11,
            Exception12, Exception13 {
        switch (flag) {
            case 0:
                throw new Exception11("Exception11");
            case 1:
                throw new Exception12("Exception12");
            case 2:
                throw new Exception13("Exception13");
            default:
                System.out.println("Unknown flag");
        }
    }
}

class Exception11 extends Exception {
    public Exception11(String msg) {
        super(msg);
    }
}

class Exception12 extends Exception {
    public Exception12(String msg) {
        super(msg);
    }
}

class Exception13 extends Exception {
    public Exception13(String msg) {
        super(msg);
    }
}

interface Selector {
    Integer next();

    boolean hasNext();
}

class Sequence {
    private Integer[] array = new Integer[8];
    private int index = 0;

    public void add(Integer integer) throws ArrayIndexOutOfBoundsException {
        if (index < array.length) {
            array[index++] = integer;
        } else {
            throw new ArrayIndexOutOfBoundsException("数组已满，无法添加新元素");
        }
    }

    public Selector getSelector() {
        return new SequenceSelector();
    }

    class SequenceSelector implements Selector {
        private int index = 0;

        @Override
        public Integer next() {
            return array[index++];
        }

        @Override
        public boolean hasNext() {
            return index < array.length;
        }
    }
}

class Exception1 extends Exception {
    public Exception1(String msg) {
        super(msg);
    }
}

class Exception2 extends Exception {
    public Exception2(String msg) {
        super(msg);
    }
}

class Exception3 extends Exception {
    public Exception3(String msg) {
        super(msg);
    }
}