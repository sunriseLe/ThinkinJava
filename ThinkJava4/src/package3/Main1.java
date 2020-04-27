package package3;

import package1.Interface4;
import package2.Lucy;

public class Main1 {
    public static void main(String[] args){
        Lucy1 lucy1=new Lucy1();
        Interface4 interface4=lucy1.getInterface();
        interface4.say();
    }
}

class Lucy1 extends Lucy {
    public Interface4 getInterface(){
        // return new MyInterface1(); // protected, can not use new
        return this.new MyInterface1();
    }
}
