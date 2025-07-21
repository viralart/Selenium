interface Shape {
    int length = 10;
    int width = 20;
    void circle();
    default void square(){
        System.out.println("this is square.....");
    }
    static void rectangle(){
        System.out.println("this is rectangle.....");
    }
}


public class InterfaceDemo implements Shape {

    public void circle(){
            System.out.println("this is circle");
    }
    void triangle(){
        System.out.println("this is a triangle");
    }
    public static void main(String args[]){
        InterfaceDemo id = new InterfaceDemo();
        id.circle();
        id.square();
        Shape.rectangle();
        id.triangle();
        System.out.println(Shape.length*Shape.width);

        Shape sh = new InterfaceDemo();
        sh.circle();
        sh.square();
        Shape.rectangle();
        System.out.println(Shape.length*Shape.width);
    
    }
}