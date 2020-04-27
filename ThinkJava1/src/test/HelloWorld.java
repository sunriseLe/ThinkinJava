package test;

import java.util.Arrays;
import java.util.Random;

/**
 * <ol>
 *     <li>Lucy</li>
 *     <li>John</li>
 *     <li>Grace</li>
 * </ol>
 */
public class HelloWorld {
    static int i = 4;

    /**
     * @param arg command line parameter
     */
    public static void main(String[] arg) {
        /*System.out.println("Hello World!");
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        testPackageClass();
        increment();
        HelloWorld helloWorld = new HelloWorld();
        System.out.println(helloWorld.i);
        System.out.println(HelloWorld.i);
        bitLOp();
        moveRight();
        showCharBinanry('a');
        showCharBinanry('2');
        compareString(new String("1234"),new String("1234"));
        randomInt();
        primeNumber();
        printBinary(13);
        Fibonacci(9);*/
        findTarget();
    }

    public static int getFirst(int n) {
        return n / 1000;
    }

    public static int getSeconde(int n) {
        return (n % 1000) / 100;
    }

    public static int getThird(int n) {
        return (n % 100) / 10;
    }

    public static int getForth(int n) {
        return n % 10;
    }

    public static int combine(int i, int j) {
        return i * 10 + j;
    }

    public static boolean testCombine(int a, int b, int target) {
        if (target == a * b) {
            return true;
        }
        return false;
    }

    public static void findTarget() {
        for (int i = 10; i < 100; i++) {
            for (int j = i + 1; j < 100; j++) {
                int target=i*j;
                if (target%100==0||target<1000){
                    continue;
                }
                String[] strs1=String.valueOf(target).split("");
                String[] strs2=(i+""+j).split("");
                Arrays.sort(strs1);
                Arrays.sort(strs2);
                if(Arrays.equals(strs1,strs2)){
                    System.out.print(target+" ");
                }
            }
        }
        System.out.print("\n");
    }

    public static void Fibonacci(int n) {
        int[] f = new int[n];
        if (n == 1) {
            f[0] = 1;
        } else {
            f[0] = 1;
            f[1] = 1;
        }
        if (n > 2) {
            for (int i = 2; i < n; i++) {
                f[i] = f[i - 1] + f[i - 2];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(f[i] + " ");
        }
        System.out.print("\n");
    }

    // 打印出来是逆序的，需要用string先行存储
    public static void printBinary(int num) {
        // 负数使用无符号右移会使得数值发生变化
        // 利用flag的左移，单独计算每一位上的1
        StringBuffer sb = new StringBuffer("");
        if (num < 0) {
            int flag = 1;
            while (flag != 0) {
                int temp = (num & flag) == 0 ? 0 : 1;
                sb.insert(0, temp);
                flag = flag << 1;
            }
            System.out.println(sb.toString());
            return;
        }
        while (num != 0) {
            int temp = (num & 1) == 0 ? 0 : 1;
            sb.insert(0, temp);
            num = num >> 1;
        }
        System.out.println(sb.toString());
    }

    public static void primeNumber() {
        int count = 0;
        for (int i = 2; i <= 1000; i++) {
            boolean flag = false;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                System.out.print(i + " ");
                count++;
            }
            if (count == 10) {
                System.out.print("\n");
                count = 0;
            }
        }
    }

    public static void randomInt() {
        Random random = new Random(330);
        for (int i = 0; i < 25; i++) {
            int a = random.nextInt(1000);
            int next = random.nextInt(1000);
            if (a > next) {
                System.out.println(a + " > " + next);
            } else if (a < next) {
                System.out.println(a + " < " + next);
            } else {
                System.out.println(a + " = " + next);
            }

        }
    }

    public static void compareString(String str1, String str2) {
        System.out.println(str1 + " == " + str2 + ": " + (str1 == str2));
        System.out.println(str1 + " != " + str2 + ": " + (str1 != str2));
        System.out.println(str1 + ".equals(" + str2 + "): " + (str1.equals(str2)));
    }

    public static void moveRight() {
        int a = -21;
        System.out.println("a = " + Integer.toBinaryString(a));
        System.out.println("有符号右移1：" + Integer.toBinaryString(a >>= 1));
        System.out.println("有符号右移2：" + Integer.toBinaryString(a >>= 1));
    }

    public static void showCharBinanry(char ch) {
        System.out.println(Integer.toBinaryString(ch));
    }

    public static void testPackageClass() {
        int x = 10;
        Integer ix = new Integer(x);
        System.out.println(ix);
        boolean flag = true;
        Boolean bflag = new Boolean(flag);
        System.out.println(bflag);
    }

    public static void bitLOp() {
        int a = 0x55, b = 0xaa;
        System.out.println("a & b = " + Integer.toBinaryString(a & b));
        System.out.println("a | b = " + Integer.toBinaryString(a | b));
        System.out.println("a ^ b = " + Integer.toBinaryString(a ^ b));
    }

    public static void increment() {
        i++;
    }
}
