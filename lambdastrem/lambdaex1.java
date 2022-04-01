package lambdastrem;

interface demoano{
    void meth1();
    void meth2();
}

// class demoanno implements demoano{
// public void dispaly(){

// }
// @Override
// public void meth1(){

// }
// @Override
// public void meth2(){
    
// }
public class lambdaex1 {
    
    public static void main(String[] args) {
     //   demoanno d1 =new demoanno();
           demoano d1 = new demoano() {
            @Override
            public void meth1(){
            
            }
            @Override
            public void meth2(){
                
            }
           };
    }
}
