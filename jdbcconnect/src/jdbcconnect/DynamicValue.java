package jdbcconnect;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class DynamicValue {
	String url=null,username=null,password=null,driver=null;
	
	public void getValues()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the driver path");
		driver=sc.next();
		System.out.println("enter the url of database");
		url=sc.next();
		System.out.println("enter the username");
		username=sc.next();
		System.out.println("enter the password");
		password=sc.next();
		if(driver!=null&url!=null&username!=null&password!=null)
			System.out.println("data is stored successfully");
		else
			System.out.println("invalid data ");
	}
	public void createPropertiesFile() throws IOException
	{
		Properties myproperties=new Properties();
		myproperties.setProperty("driver",driver);
		myproperties.setProperty("url", url);
		myproperties.setProperty("username", username);
		myproperties.setProperty("password",password);
		FileWriter file=new FileWriter("jdbcconnect.properties");
		myproperties.store(file,"new jdbc connection properties");
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DynamicValue d=new DynamicValue();
		d.getValues();
		d.createPropertiesFile();

	}

}
