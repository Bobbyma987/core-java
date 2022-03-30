package basic.oop1;

import java.util.Hashtable;

public class hahtableex {
    
    public static void main(String[] args) {
        Hashtable<String,Integer> ht = new Hashtable<>();

        ht.put("kajal", 4049);
        ht.put(("bobby"),5057);
        ht.put("geet", 2);
        ht.put("radhe", 10);

        ht.forEach((k,v) -> {
            System.out.println(k+" "+v);
        });
        System.out.println(ht);
    }
}
