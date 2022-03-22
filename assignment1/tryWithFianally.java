package assignment1;

public class tryWithFianally {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }
        finally{
            System.out.println("inside finally block");
        }
    }
    
}
