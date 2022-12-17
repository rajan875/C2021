import java.sql.*;



public class Select {
	static Connection con;
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/newdb";
			String user="root";
			String password="12345";
			
				
			con =DriverManager.getConnection(url, user, password);
			
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from student");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+" \t "+rs.getString(2)+" \t "+rs.getString(3)+" \t"+rs.getString(4));  
			con.close();  
			
			
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
