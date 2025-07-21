class A{
        int a =100;
        void display(){
            System.out.println(a);
        }
    }
    class B extends A{
        int b =200;
        void show(){
            System.out.println(b);
        }
    }
    class C extends B{
        int c = 300;
        void print(){
            System.out.print(c);
        }
    }


public class InheritanceType {

        public static void main(String args[]){

        B bobj = new B();
        System.out.println(bobj.a);
            C cobj = new C();
            System.out.print(cobj.b);
    }
}
