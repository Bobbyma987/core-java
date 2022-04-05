
// import java.util.HashMap;
// import java.util.List;
// import java.util.Map;
// import java.util.Set;
// import java.util.ArrayList;
// import java.util.Map.Entry;
// public class accending_order {
//     public static void main(String[] args) {
//         Map<String, Integer> pb = new HashMap<>();
//         pb.put("bobby",80);
//         pb.put("kajal",70);
//         pb.put("digant",86);
//         pb.put("shubham",89);
//         pb.put("did",83);
//         Set<Map.Entry<String,Integer>> values = pb.entrySet();
      
//       for(Map.Entry<String,Integer> e : values){
//           System.out.println(e.getKey()+" "+e.getValue());

         
//          List<Entry<String,Integer>> list = new ArrayList<>(pb.entrySet());
//          list.sort(Entry.comparingByValue());
//          list.forEach(System.out::println );
//       }
// }
// }



package test1;
import java.util.Collection;

import java.util.Collections;

import java.util.Comparator;

import java.util.HashMap;

import java.util.LinkedHashMap;

import java.util.LinkedList;

import java.util.List;

import java.util.Map;



public class accending_order {

   

    public static HashMap<String, Integer> sortByValue(Map<String, Integer> hm)

    {

       

        List<Map.Entry<String, Integer> > list =

               new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());

               Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {

                public int compare(Map.Entry<String, Integer> o1,
    
                                   Map.Entry<String, Integer> o2)
    
                {
    
                    return (o1.getValue()).compareTo(o2.getValue());
    
                }
    
            });
    
             
    
           
    
            HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
    
            for (Map.Entry<String, Integer> aa : list) {
    
                temp.put(aa.getKey(), aa.getValue());
    
            }
    
            return temp;
    
        }
        public static void main(String[] args) {

            Map<String,Integer> hm=new HashMap<>();
    
            hm.put("bob", 1);
    
            hm.put("adity", 2);
    
            hm.put("kj", 45);
    
            hm.put("didi", 78);
    
            hm.put("kajal", 36);
    
            Map<String, Integer> hm1 = sortByValue(hm);
    
            for (Map.Entry<String, Integer> en : hm1.entrySet()) {
    
                System.out.println("Key = " + en.getKey() +
    
                              ", Value = " + en.getValue());
    
            }
    
        }
    
    }