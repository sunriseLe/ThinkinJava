package adpater;

import java.awt.*;
import java.awt.dnd.DropTarget;
import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.RandomAccess;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(RandVals.RANDINT);
        System.out.println(RandVals.RANDLONG);
        System.out.println(RandVals.RANDFLOAT);
        System.out.println(RandVals.RANDDOUBLE);
        System.out.println("==========================");
        System.out.println(RandVals.RANDINT);
        System.out.println(RandVals.RANDLONG);
        System.out.println(RandVals.RANDFLOAT);
        System.out.println(RandVals.RANDDOUBLE);
    }
}

interface RandVals{
    // once initialised, value will not change
    Random RAND=new Random(30);
    int RANDINT=RAND.nextInt(10);
    long  RANDLONG=RAND.nextLong();
    float RANDFLOAT=RAND.nextFloat();
    double RANDDOUBLE=RAND.nextDouble();
}

interface Week {
    int SUNDAY = 1, MONDAY = 2, TUESDAY = 3, WEDNESDAY = 4,
            THURSDAY = 5, FRIDAY = 6, SATURDAY = 7;
}

class Calender implements Week {
    private static int count = 0;// 统计类的对象数量
    private int id = ++count; // 保存当前对象的序号

    public Calender() {
        System.out.println("Calender " + id);
    }

    public void hello(){
        System.out.println("hello "+count);
    }

    public static void print(){
        System.out.println("count: "+count);
    }

    public static void main(String[] args) {
        System.out.println("Monday: " + Calender.MONDAY);
        Calender calender = new Calender();
        System.out.println("id: "+calender.id);
    }
}

interface Test1{
     interface Test2{

    }
}

abstract class Test11{
    private interface Test22{

    }
}

class RandomChar {
    private interface Test{

    }
    private static Random rand = new Random();

    public char next() {
        int flag = rand.nextInt(128);
        while (flag < 65 || flag > 90) {
            flag = rand.nextInt(128);
        }

        return (char) flag;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new AdapterRandomChar(24));
        int number = 0;
        while (scanner.hasNext()) {
            number++;
            System.out.println(scanner.next() + " " + number);

        }
    }
}

class AdapterRandomChar extends RandomChar implements Readable {
    private int count;// random series number

    public AdapterRandomChar(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if (count-- == 0) {// already produce all series
            return -1;
        }
        // space means next param in scanner
        // no space,there will be just one next im scanner
        String result = next() + " ";
        cb.append(result);
        return result.length();
    }
}
