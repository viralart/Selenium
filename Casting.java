class Parent1{
    String name = "Test";
    void m1(){
        System.out.println("from parent");
    }
}
class Child extends Parent{
    int i = 101;
    void m2(){
        System.out.println("from child");
    }
}

public class Casting {
    public static void main(String args[]){
        Child ch = new Child();
        System.out.println(ch.name());
    }
}
