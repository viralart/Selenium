import java.util.HashMap;

public class HashMapDemo {
    public static void main(String args[]){
        HashMap <Integer, String> hm = new HashMap<Integer, String>();

        hm.put(101,"viral");
        hm.put(102,"kumar");
        hm.put(103,"maurya");
        hm.put(104,"test");
        hm.put(105,"QA");
        hm.put(105,"Q");
        System.out.println(hm.size());
        hm.remove(104);
        System.out.println(hm);
        System.out.println(hm.get(104));

        for(int k: hm.keySet()){
            System.out.println(hm.get(k));
        }
        // hm.clear();
        System.out.println(hm.isEmpty());
    }   
}
