package JDBCDriver;
import java.sql.*;
import java.time.Year;
public class CreatingCon {
    
    public static void  main(String args[]) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vsdatabase","root","");
            Statement s= con.createStatement();
            ResultSet rs = s.executeQuery("select * from practice");
            while(rs.next())
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
                con.close();
          }
          catch(Exception e) {
              System.out.print(e);
          }
                
            }
        }
    


