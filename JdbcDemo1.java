import java.sql.*;

class JdbcDemo1
{
  public static void main(String args[ ])
   {
      Connection con=null;

      try
        {
          //Loading driver in memory
          Class.forName("oracle.jdbc.driver.OracleDriver");

          //Building bridge between database & java language
          con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "javapatil"); 

          //Building query
          String query="Select * from student";

           //Firing query to database
           Statement stmt=con.createStatement();
           ResultSet rs=stmt.executeQuery(query);

           //Iterating through records
           while(rs.next()) 
            {
              System.out.println(rs.getInt("sno") + "  " + rs.getString("sname") + " " + rs.getInt("age"));
            }

           //Closing objects
           rs.close();
           stmt.close();
           con.close();
        }
     catch(Exception e)
        {
          System.out.println(e);
        } 

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

