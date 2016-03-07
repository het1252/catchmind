package server;

import java.sql.*;

public class Database {
	Connection con;
	Statement stmt;
	
	Database()
	{
		String url = "jdbc:mysql://localhost:3306/userinfo";
		String id =	"root";
		String pwd = "key1234";
		try {
			con = DriverManager.getConnection(url, id, pwd);
			stmt = con.createStatement();
		} catch (SQLException e) {
			System.out.println("db초기화");
		}
	}
	public String Checkid(String s)
	{
		ResultSet rs;
		boolean t = false;
		try {
			System.out.println(s);
			rs = stmt.executeQuery("select * from userinfo");
			while(rs.next())
			{
				if(rs.getString("name").equals(s))
				{
					t = true;
					System.out.println("ㅎ하");
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return String.valueOf(t);
	}
	public String Signin(String s)
	{
		boolean t = false;
		try{
			String g ="insert into userinfo(name) values "+"('"+s+"')";
			stmt.executeUpdate(g);
			t = true;
		}
		catch(SQLException e)
		{
			System.out.println("가입에러");
		}
		return String.valueOf(t);
	}
	public static void main(String args[])
	{
		new Database().Signin("test");
	}
}
