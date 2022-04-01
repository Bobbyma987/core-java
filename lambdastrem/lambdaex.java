package lambdastrem;

interface run{
    void runn();
}
public class lambdaex {
    public static void main(String[] args) {
        run r =()->{
            System.out.println("running");
        };
    r.runn();
    }
}
