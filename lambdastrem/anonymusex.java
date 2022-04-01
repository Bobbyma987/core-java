package lambdastrem;

class A{
   public void show(){
       System.out.println("i am bob");
   }
}
public class anonymusex{
public static void main(String[] args) {
    A obj = new A(){
      public void show(){
          System.out.println("i am bobby");
      }
    };
    obj.show();
}
}

  

