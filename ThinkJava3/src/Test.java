public class Test {
    public static void main(String[] args) {
        Father.staticMethod(); // 运行结果：Father staticMethod
        /**
         * 结论：
         * 类执行了自己申明的静态方法。
         * 该子类实际上只是将父类中的同名静态方法进行了隐藏，而非重写。
         * */
        Son.staticMethod(); // 运行结果：Son staticMethod
        Father father = new Son();
        /**
         * 结论：
         * 父类引用指向子类对象时，只会调用父类的静态方法。
         * 父类和子类中含有的其实是两个没有关系的方法，它们的行为也并不具有多态性。
         * */
        father.staticMethod(); // 运行结果：Father staticMethod
    }
}

class Father {
    public static void staticMethod() {
        System.out.println("Father staticMethod");
    }
}

class Son extends Father {
    public static void staticMethod() {
        System.out.println("Son staticMethod");
    }
}
