package jdbc.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;


public class PreparedStatement 
{
	private static final String db_driverclass = "com.mysql.cj.jdbc.Driver";
	private static final String db_url = "jdbc:mysql://localhost:3306/jdbcdb1";
	private static final String db_username ="root";
	private static final String db_password ="Arubel38@";
	private static Connection con = null;
	public static void main(String[] args) throws SQLException, ClassNotFoundException 
	{
		Class.forName(db_driverclass);
		con = DriverManager.getConnection(db_url, db_username, db_password);
		String sqlinsert = "insert into jdbcdb1.employee values(?,?,?)";
		java.sql.PreparedStatement st = con.prepareStatement(sqlinsert);
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		           System.out.println("Enter emp id");
		           int eid = sc.nextInt();
		           System.out.println("Enter emp name");
		           String ename = sc.next();
		           System.out.println("Enter emp salary");
		           double esal = sc.nextDouble();
		           st.setInt(1,eid);
		           st.setString(2,ename);
		           st.setDouble(3,esal);
		           st.executeUpdate();
		           System.out.println("Values are added successfully…do you want one more(yes/no)");
		           String option = sc.next();
		           if(option.equals("no"))
		           {
		        	   break;
		           }
		}
	}
}
