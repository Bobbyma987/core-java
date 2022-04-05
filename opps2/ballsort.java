package opps2;

import java.util.ArrayList;
import java.util.List;

import org.omg.Messaging.SyncScopeHelper;

public class ballsort {
    public static void main(String[] args) {

          Ball b1 = new Ball("white",180,"rubber", "cricket");
          Ball b2 = new Ball("red", 100, "rubber", "football"); 
    
          List<Ball> list= new ArrayList<>();
          list.add(b1);
          list.add(b2);

          list.sort((a, b) -> {
             if (a.size < b.size){
                 return -1 ;
             }
           return 0;
          });
          list.forEach(System.out::println );
        }
}
