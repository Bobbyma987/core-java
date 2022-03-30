package opps2;

public class Ball {
 String color;
 int size;
 String material;
 String game;   
 

 public Ball(String color, int size, String material, String game){
       this.color=color;
       this.size=size;
       this.material=material;
       this.game=game;

 }



@Override
public String toString() {
    return "Ball [color=" + color + ", game=" + game + ", material=" + material + ", size=" + size + "]";
}



static Ball b1 = new Ball("white",180,"rubber", "cricket");
   static Ball b2 = new Ball("red", 100, "rubber", "football"); 
    public static void main(String[] args) {

        System.out.println(b1.toString());// convert obj into striing
         System.out.println(b2.toString());
    
    }

}