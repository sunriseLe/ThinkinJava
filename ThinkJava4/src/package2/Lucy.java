package package2;

import package1.Interface4;

 public class Lucy{
    protected class MyInterface1 implements Interface4 {
        public MyInterface1(){}
        @Override
        public void say() {
            System.out.println("MyInterface: hello lucy ...");
        }
    }

    public static void main(String[] args){

    }
}

