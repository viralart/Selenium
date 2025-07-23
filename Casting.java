class Parent1{
    String name1 = "Test";
    void m1(){
        System.out.println("from parent");
    }
}
class Child extends Parent1{
    int i = 101;
    void m2(){
        System.out.println("from child");
    }
}

public class Casting {
    public static void main(String args[]){
        // Child ch = new Child();
        // System.out.println(ch.name1);

        // Parent1 p = new Child();
        // p.m1();
        // System.out.println(p.name1);

        Child ch = (Child) new Parent1();
        System.out.println(ch.name1);

    }
}
