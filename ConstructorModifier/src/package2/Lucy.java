package package2;

public class Lucy {
    public static void main(String[] args) {
    }


}

class Test {
    private String str;

    public Test(String str) {
        this.str = str;
    }

    private void print() {
        System.out.println(str);
    }

    private void getI() {
        InnerTest innerTest = new InnerTest();
        System.out.println("innerTest.i: " + innerTest.i);
        innerTest.showI();
    }

    class InnerTest {
        private int i = 10;

        public void setTestStr(String str) {
            Test.this.str = str;
            ;
            System.out.println("After change: " + Test.this.str);
        }

        private void showI() {
            System.out.println("showI: " + i);
        }
    }

    public static void main(String[] args) {
        Test test = new Test("di di di ...");
        test.print();
        InnerTest innerTest = test.new InnerTest();
        innerTest.setTestStr("wu wu wu ...");
        test.getI();
    }

}


