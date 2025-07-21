public class Animal {
    String colour = "White";
}
class Dog extends Animal{
    String colour = "Black";
    void displayColour(){
        System.out.println(super.colour);
    }
}
