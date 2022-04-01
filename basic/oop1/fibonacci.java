package basic.oop1;

public class fibonacci {
    public static void main(String[] args) {
        int n= 5 ;
        int sum =0;
        int a=1;
        int b=0;
        for(int i =1 ;i<=n; i++){
            
             sum = a+b;
             b=a;
             a=sum;
             System.out.println(sum);

        }
    }
}
