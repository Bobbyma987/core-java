package assignment1;
public class nestedtrycatch {
    public static void main(String[] args) {

         try{
             try{
                
                 int b =39/0;
                 System.out.println("b");
             }
             catch(ArithmeticException e){
                 System.out.println(e);
             }
             try{
                 int a[]= new int [6];
                 a[6]=4;
             }
             catch(ArrayIndexOutOfBoundsException e){
                 System.out.println(e);
             }
               System.out.println("other statement");
         }
         catch(Exception e){
             System.out.println("handled  the execption");
         }
         System.out.println("normal flow.....");
    }
}
