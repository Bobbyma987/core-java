package filehandlingANDmltitrding;

import java.io.IOException;
import java.io.*;
public class randomascess {

    public static void main(String[] args) {
        try{
            RandomAccessFile file = new RandomAccessFile("filehandlingANDmltitrding/note.txt", "rw");
           // System.out.println(file.readLine());

    
           System.out.println(file.readChar());
           System.out.println(file.readLine());
             
        //    file.writeBytes(" ");
        //    System.out.println(file.readLine());

        //    file.writeChar("B")                        

        //    file.seek(0);
            file.close();
         }catch(IOException e){
             e.printStackTrace();
         }
    }
    
}
