package strings;

public class basicstring {

    public static void main(String[] args) {
        String s= "my name is bobby. ";
        String s1 ="i am an human being";

        System.out.println(s.length());
        System.out.println(s.charAt(5));
        System.out.println(s.substring(3, s.length()));
        System.out.println(s.equals("my name is bobby. "));
        System.out.println(s.concat(s1));
        System.out.println(s.indexOf('b'));
        System.out.println(s.startsWith("my"));
        System.out.println(s.equalsIgnoreCase("my name"));
        System.out.println(s.replace("bobby", "kajal"));
         
         String [] str = new String[5];
         str[0] ="bobby";

            int arr [] = new int [2];
            arr[0]=1;

            System.out.println(str[0]);
            System.out.println(arr[0]);
    }
    
}
