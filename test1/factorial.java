package test1;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
         int n =sc.nextInt();
         int fact=1;
         for (int i=1; i <=n;i++){
             fact=i*fact;
      
         }
         System.out.println(fact);
    }
}

// using recursion
