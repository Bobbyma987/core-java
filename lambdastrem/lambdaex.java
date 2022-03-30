package lambdastrem;

interface run{
    void run();
}
public class lambdaex {
    public static void main(String[] args) {
        run r =()->{
            System.out.println("running");
        };
    r.run();
    }
}
