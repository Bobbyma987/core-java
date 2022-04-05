package hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class basicpractise {
    public static void main(String[] args) {
        Map<String, String> pb = new HashMap<>();
        pb.put("bobby","8087342421");
        pb.put("kajal","7038354049");
        pb.put("digant","8600421521");
        pb.put("shubham","8919974515");
        pb.put("did","8319163898");
    //     Set<String> keys = pb.keySet();

    //     for(String i : keys){
    //         System.out.println(i +" "+ pb.get(i));
    //     }
    //     System.out.println(pb.get("bobby"));
      Set<Map.Entry<String,String>> values = pb.entrySet();
      
      for(Map.Entry<String,String> e : values){
          System.out.println(e.getKey()+" "+e.getValue());
     
      }
}
  
}
