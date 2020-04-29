package package2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        /*try {
            throw new Exception1();
        }catch (Exception1 e){
            System.err.println(e);
        }

        try {
            throw new Exception2();
        }catch (Exception2 e){
            System.err.println(e);
        }*/
        /*int[] array={1,2,3,4,5};
        try {
            for (int i=0;i<6;i++){
                System.out.print(array[i]+" ");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            Exception3.logException(e);
        }*/
        try {
            Exception4.nullFun();
        } catch (NullPointerException e) {
            System.out.println("call nullFun");
            e.printStackTrace();
        }
    }
}

class Exception4 {
    public static void nullFun() throws NullPointerException {
        String str = null;
        if (str == null) {
            throw new NullPointerException();
        }
    }
}

class Exception3 {
    private static Logger logger = Logger.getLogger("Exception3 logger");

    static void logException(Exception e) {
        StringWriter writer = new StringWriter();
        e.printStackTrace(new PrintWriter(writer));
        logger.severe(writer.toString());
    }
}

class Exception1 extends Exception {
    private static Logger logger = Logger.getLogger("Exception1 logger");

    public Exception1() {
        StringWriter writer = new StringWriter();
        printStackTrace(new PrintWriter(writer));
        logger.severe(writer.toString());
    }
}

class Exception2 extends Exception {
    private static Logger logger = Logger.getLogger("Exception2 logger");

    public Exception2() {
        StringWriter writer = new StringWriter();
        printStackTrace(new PrintWriter(writer));
        logger.severe(writer.toString());
    }
}