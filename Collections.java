import java.util.ArrayList;

public class Collections {
    public static void main(String args[]){
        ArrayList arr = new ArrayList<>();
        arr.add("Welcome");
        arr.add(20);
        arr.add(2.86);
        arr.add(1000000);
        arr.add(true);
        arr.add(null);
        arr.add(20);
        arr.add(2.86);
        arr.add(1000000);
        arr.add(true);
        System.out.println(arr.size());
        System.out.println(arr);
        arr.remove(3);
        System.out.println(arr);
    }
}
