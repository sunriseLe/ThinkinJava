package package1;

public class Main {
    public static void func() throws Exception1 {
        System.out.println("throw new Exception1 from func()");
        throw new Exception1("unknown error");
    }

    public static void main(String[] args) {
        /*try {
            func();
        }catch (Exception1 e){
            e.printStackTrace();
        }finally {
            System.out.println("print exception complete");
        }*/
        /*int[] arr={1,2,3,4,5};
        try {
            for (int i=0;i<6;i++){
                System.out.print(arr[i]+" ");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }*/
       /* Gerbil gerbil=null;
        try {
            gerbil.hop();
        }catch (NullPointerException e){
            e.printStackTrace();
        }*/
        /*try {
            func();
        }catch (Exception1 e){
            e.printReason();
        }*/
        boolean flag = true;
        int[] arr = {1, 2, 3, 4, 5};
        int i = 8;
        while (true){
            try {
                System.out.print("arr["+i+"] = "+arr[i]+" ");
                break;
            }catch (ArrayIndexOutOfBoundsException e){
                e.printStackTrace();
                i--;
            }
        }
    }
}

class Gerbil {
    private String name;

    public Gerbil(String name) {
        this.name = name;
    }

    public void hop() {
        System.out.println("Gerbil " + name + " jumping");
    }
}

class Exception1 extends Exception {
    private String reason;

    public Exception1(String msg) {
        super(msg);
        this.reason = msg;
    }

    public void printReason() {
        System.out.println(reason);
    }
}