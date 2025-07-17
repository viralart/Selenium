public class Greetings {
    
    //no parameters, no return type
    void m1(){
        System.out.println("Hello");
    }

    //no prarmeters, with retun type
    String m2(){
        return "Hello";
    }

    //with parameter, no return type
    void m3(String str){
        System.out.println(str);
    }

    //with parameters and return type
    int m4(int a,int b){
        return a+b;
    }
}
