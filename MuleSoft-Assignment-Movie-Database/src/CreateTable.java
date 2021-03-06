import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.SQLException;  
import java.sql.Statement;  
   
public class CreateTable {  
   
    public static void createTable() {  
        String url = "jdbc:sqlite:F:/Mulesoft Resources/SQLiteStudio/Movies.db";   
        String sql = "CREATE TABLE IF NOT EXISTS Movies (\n"  + " Movie_id integer ,\n"  + " Movie_name char(40),\n"  + " Lead_actor char(40),\n"  + " Lead_Actress char(40),\n"  + " Year_released integer,\n"  + " Director_name char(40) \n"  + ");";  
          
        try{  
            Connection conn = DriverManager.getConnection(url);  
            Statement st = conn.createStatement();  
            st.execute(sql);  
        } 
        catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
    }  

    public static void main(String[] args) {  
        createTable();  
    }  
   
}  