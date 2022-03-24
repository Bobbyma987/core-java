package opps2.classandobject;

public class student {
    
    String name;
     int rollno;
     String address;
     int id;

     public student (String myName, int rollno,String address, int id){
         name= myName;
         this.rollno = rollno;
         this.address = address;
         this.id=id;
     }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

}
 class student1{
    
    public static void main(String[] args) {
        // Scanner s = new Scanner(System.in);
         
        student s1 = new student( "bobby", 1,"partur", 2);
        student s2 = new student( "kajal", 2, "nagpur", 3);
           
        // System.out.println(s1);
        // System.out.println(s2);
        // s1.name ="bobby";
        // s1.rollno =100;
        // s1.address="partur";
        System.out.println(s1.name +" "+s1.id+" "+s1.address+" "+ s1.rollno);
        // s2.name="kajal";
        // s2.rollno=49;
        // s2.address="nagpur";
        System.out.println(s2.name +" "+s2.id+" "+s2.address+" "+ s2.rollno);
    }
}
