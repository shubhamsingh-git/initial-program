package jdbcconnect;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DbConnection {
	String driver=null,url=null,username=null,password=null;
	
	public void getPropertiesFile() throws IOException
	{
	Properties pro=new Properties();	
	FileReader file=new FileReader("jdbcconnect.properties");
	pro.load(file);
	driver=pro.getProperty("driver");
	url=pro.getProperty("url");
	username=pro.getProperty("username");
	password=pro.getProperty("password");
	}
	public void getConnectionDb() throws ClassNotFoundException, SQLException
	{
		Class.forName(driver);
		Connection con=DriverManager.getConnection(url,username,password);
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from student");
		while(rs.next())
		{
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getString(4));
			
		}
		
		
	}
//
	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		DbConnection db=new DbConnection();
		db.getPropertiesFile();
		db.getConnectionDb();

	}

}
