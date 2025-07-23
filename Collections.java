import java.util.ArrayList;
import java.util.Iterator;

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
        // System.out.println(arr.size());
        // System.out.println(arr);
        // arr.remove(3);
        // System.out.println(arr);
        // arr.add(6, "Welcome");
        // System.out.println(arr);
        // System.out.println(arr.get(7));
        // arr.set(7, "Yellow");
        // System.out.println(arr);
        // for(int i=0;i<arr.size();i++){
        //     // You can process each element here, for example:
        //     System.out.println(arr.get(i));
        // }
        // for(Object x:arr){
        //     System.out.println(x);
        // }

        // Iterator it = arr.iterator();
        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }
        // System.out.println(arr.isEmpty());


        ArrayList mylist = new ArrayList();
        mylist.add("Welcome");
        mylist.add(20);
System.out.println(arr);
        arr.removeAll(mylist);
        System.out.println(mylist);
        mylist.clear();
        System.out.println(mylist.isEmpty());
    }
}
