public class StaticDemo {

    static int a=10;
    int b=20;

    static void m1(){
        System.out.println("this is a static method");
    }
    void m2(){
        System.out.println("this is a non-static method");
    }

    public static void main(String args[]){

        System.out.println(a);
        m1();
        System.out.println();
        

    }
}
