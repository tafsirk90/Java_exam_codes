import java.sql.*;
public class StudentDAO {
    public void insert(Student student)  {
        String sql = "insert into student (id,name,marks) values (?,?,?)";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                Connection con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/demo_info", "root", ""
                );
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1,student.getId());
                ps.setString(2,student.getName());
                ps.setInt(3,student.getMarks());
                ps.executeUpdate();
                System.out.println("Inserted Successfully");
            } catch (SQLException e) {
                System.out.println("Database not found " + e.getMessage());
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Driver Not Found " + e.getMessage());
        }
    }
}
