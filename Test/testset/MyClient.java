import java.io.*;  
import java.net.*;  
import java.util.Scanner;
public class MyClient {  
    public static void main(String[] args) {  
        try{      
            Socket s=new Socket("localhost",6666);  
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
            Scanner in = new Scanner(System.in);
            String teext = "";
            while(!teext.equals("stop"))
            {
                System.out.println("What would you like to say? ");
                teext = in.next();
                dout.writeUTF(teext);  
                dout.flush();
                dout.close(); 
            }
             
            s.close();  
        }catch(Exception e){System.out.println(e);}  
    }  
}  