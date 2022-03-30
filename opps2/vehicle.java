package opps2;

public abstract class vehicle {

int nooftyres;
   abstract void start();
    
}

class car extends vehicle{

    void start(){
        System.out.println("key");
    }
}

class scooter extends vehicle{
    
    void start(){
        System.out.println("kick");
    }
    public static void main(String[] args) {
        car c = new car();
        c.start();
        scooter s= new scooter();
        s.start();
    }
}
