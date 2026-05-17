import java.io.*;
import java.net.*;

class MyClient
{
  public static void main(String args[ ])
   {
while(true)
 { 
     try
      {
        Socket s=new Socket("localhost", 47);

        //Writing data to server
         DataInputStream dis=new DataInputStream(System.in);
         System.out.println("Enter data to be sent to server.");
         String str=dis.readLine();

         OutputStream os=s.getOutputStream();
         ObjectOutputStream oos=new ObjectOutputStream(os);
         oos.writeObject(str); 

        //Reading data from server
        InputStream is=s.getInputStream();
        ObjectInputStream ois=new ObjectInputStream(is);
        str=(String)ois.readObject();
        System.out.println("Server says: " + str);


         ois.close();
         is.close();
         oos.close();
         os.close();
         s.close();
      }
     catch(Exception e)
      {
      }

 }

   }
}
