import java.sql.DriverManager;  
import java.sql.Connection;  
import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.sql.Statement;  
   
public class Selecting {  
   
    private Connection connect() {  
        String url = "jdbc:sqlite:F:/Mulesoft Resources/SQLiteStudio/Movies.db";  
        Connection conn = null;  
        try {  
            conn = DriverManager.getConnection(url);  
        } 
        catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
        return conn;  
    }  
   
    public void selectAll(){  
        String sql = "SELECT * FROM Movies";  
        try {  
            Connection conn = this.connect();  
            Statement st  = conn.createStatement();  
            ResultSet rs  = st.executeQuery(sql);  
            while (rs.next()) {  
                System.out.println(rs.getInt("Movie_id") +  "\t" +  rs.getString("Movie_name")+ "\t" + rs.getString("Lead_Actor") + "\t" + rs.getString("Lead_Actress") + "\t" +  rs.getInt("Year_released") + "\t" +  rs.getString("Director_name") + "\t");  
            }  
        } 
        catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
    }  

    public static void main(String[] args) {  
        Selecting app = new Selecting();  
        app.selectAll();  
    }  
   
}  