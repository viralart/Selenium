public class Adder {

    int a=20,b=30;

    void sum(){
        System.out.println(a+b);
    }
    void sum(int x,int y){
        System.out.println(x+y);
    }
    void sum(int x, double y){
        System.out.println(x+y);
    }
    void sum(double x, int y){
        System.out.println(x+y);
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
    
}
