import java.sql.*;
public class PrintAll {
    String sql = "select * from student";
    public void print(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            try{
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_info", "root", "");
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    String name = rs.getString("name");
                    int id = rs.getInt("id");
                    int marks = rs.getInt("marks");
                    System.out.println(name + " " + id + " " + marks);
                }
            }catch(SQLException e){
                System.out.println("Database not found");
            }
        }catch(ClassNotFoundException e){
            System.out.println("Driver not found " + e.getMessage());
        }
    }
}
