package assignment1;

import org.omg.PortableServer.POAManagerPackage.AdapterInactiveHelper;

public class multipleCatch {
    public static void main(String[] args) {
        try{
            int [] arr = new int[5];
             arr [2]=25;
            System.out.println(arr[8]); 

        }
        catch(ArithmeticException e){
            System.out.println("Arithematic exception occurs");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds Exception occurs" );
        }catch(Exception e){
            System.out.println("parent exception occurs");
        }
        System.out.println("execute");
        
    }
    
}
