import java.sql.*;
import java.io.*;

class JdbcDemo2
{
  public static void main(String args[ ]) throws IOException
   {
      DataInputStream dis=new DataInputStream(System.in);

      System.out.println("Enter sno");
      String sno=dis.readLine();

      System.out.println("Enter sname");
      String sname=dis.readLine();

      System.out.println("Enter age");
      String age=dis.readLine();

      Connection con=null;

      try
        {
          //Loading driver in memory
          Class.forName("oracle.jdbc.driver.OracleDriver");

          //Building bridge between database & java language
          con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "sachin"); 

          //Building query
          //String query="Insert into student values(5, 'Anant', 24)";
          //String query="Insert into student values(" + "5" + ", '" +  "Anant" + "', " + "24"  ")";
          String query="Insert into student values(" + sno + ", '" +  sname + "', " + age + ")";

           //Firing query to database
           Statement stmt=con.createStatement();
           stmt.executeUpdate(query);

           //Closing objects
           stmt.close();
           con.close();
        }
     catch(Exception e)
        {
          System.out.println(e);
        } 

      System.out.println("Record inserted succ");
   }
}

/*
Method of 'DriverManager' class:
getConnection() :---
public static synchronized Connection getConnection(String url/dsn, String uid, String pwd) 
throws SQLException

Method of 'Connection' interface:
createStatement():--
Statement createStatement()

Methods of 'Statement' interface:
i) executeQuery():
    ResultSet executeQuery(String query) throws SQLException

ii) executeUpdate():
     int executeUpdate(String query) throws SQLException
 
Methods of 'ResultSet' interface:
i) next() :-- boolean next()
ii) getString() :-- String getString(String columnName)
iii) getInt() :-- int getString(String columnName)
*/

