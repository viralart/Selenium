public class AdderMain {
    public static void main(String args[]){
        Adder obj = new Adder();
        obj.sum();
        obj.sum(100,200);
        obj.sum(10.34523,5);
        obj.sum(10,5.34523);
        System.out.println(obj.sum(5,4,6));
    }
    
}
