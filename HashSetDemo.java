import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

    public static void main(String args[]){
        HashSet hs = new HashSet();
         hs.add("Welcome");
        hs.add(20);
        hs.add(2.86);
        hs.add(1000000);
        hs.add(true);
        hs.add(null);
        hs.add(20);
        hs.add(2.86);
        hs.add(true);
        hs.add(null);
        hs.add(20);
        System.out.println(hs);

        hs.remove(null);
        System.out.println(hs);

        ArrayList arrList = new ArrayList(hs);
        System.out.println(arrList);
        System.out.println(arrList.get(2));

        for(Object i : hs){
            System.out.println(i);
        }

        Iterator <Object> it = hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        hs.clear();
        System.out.println(hs.size());


    }
    
}
