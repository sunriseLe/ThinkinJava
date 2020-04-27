package package2;

public class Main {
    public static void main(String[] args) {
        /*Test1 test1 = new Test1();
        Test1.Test1Base1 base1 = new Test1.Test1Base1();
        base1.print();*/
    }
}


class Test1 {
    public Test1() {
        System.out.println("Test1 initialize ...");
    }

    static class Test1Base1 {
        Test1Base1() {
            System.out.println("Test1Base1 initialize ...");
        }

         void print() {
            System.out.println("this is base1");
        }
    }

    private static class Test1Base2 {
        private Test1Base2() {
            System.out.println("Test1Base2 initialize ...");
        }

        void print() {
            System.out.println("this is base2");
        }
    }

    public static void main(String[] args) {
        Test1Base1 base1 = new Test1Base1();
        base1.print();
        Test1Base2 base2 = new Test1Base2();
        base2.print();
    }
}

class Test2{
    Test2(){
        System.out.println("Test2构造函数");
    }

    private class Test2Inner1{
        Test2Inner1(){
            System.out.println("Test2Inner1构造函数");
        }

        class Inner1Inner2{
            Inner1Inner2(){
                System.out.println("Inner1Inner2构造函数");
            }
        }
    }

    static class Test2Inner2{
        Test2Inner2(){
            System.out.println("Test2Inner2构造函数");
        }

        static class Inner2Inner2{
            Inner2Inner2(){
                System.out.println("Inner2Inner2构造函数");
            }
        }
    }

    public static void main(String[] args){
        Test2 test2=new Test2();
        Test2Inner1 inner1=test2.new Test2Inner1();
        Test2Inner1.Inner1Inner2 inner12=inner1.new Inner1Inner2();
        Test2Inner2 inner2=new Test2Inner2();
        Test2Inner2.Inner2Inner2 inner22=new Test2Inner2.Inner2Inner2();
    }
}