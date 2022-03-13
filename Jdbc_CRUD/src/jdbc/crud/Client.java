package jdbc.crud;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Client {
	
	private static void addEmployee() throws SQLException
	{
		Connection connection = DBUtil.getConnection();
		Statement st = connection.createStatement();
		String sqlinsert = "insert into jdbcdb.employees (id,name,salary,bonus)"+"values(3,'Ganesh',500,200)";
		int executeUpdate = st.executeUpdate(sqlinsert);
		if(executeUpdate == 1)
		{
			System.out.println("Entry is added");
		}
	}
	
	private static void updateEmployee() throws SQLException
	{
		Connection connection = DBUtil.getConnection();
		Statement st = connection.createStatement();
		String sqlupdate = "update jdbcdb.employees set bonus= 300 where id =2";
		int executeUpdate = st.executeUpdate(sqlupdate);
		if(executeUpdate == 1)
		{
			System.out.println("Entry are updated");
		}
	}
	
	private static void deleteEmployee() throws SQLException
	{
		Connection connection = DBUtil.getConnection();
		Statement st = connection.createStatement();
		String sqldelete = "delete from jdbcdb.employees where id = 1";
		int executeUpdate = st.executeUpdate(sqldelete);
		if(executeUpdate == 1)
		{
			System.out.println("Entry is Deleted");
		}
	}
	
	private static void retrievebyidEmployee() throws SQLException
	{
		Connection connection = DBUtil.getConnection();
		Statement st = connection.createStatement();
		String sqlretrieve = "select * from jdbcdb.employees where id = 2 ";
		ResultSet rs = st.executeQuery(sqlretrieve);
		if(rs.next())
		{
			int id = rs.getInt("id");
			String name = rs.getString("name");
			int salary = rs.getInt("salary");
			int bonus = rs.getInt("bonus");
			System.out.println(id + " " + name + " " + salary + " " + bonus);
		}
		else
		{
			System.out.println("Employee not available with mentioned id");
		}
	}
	
	private static void retrieveallEmployee() throws SQLException
	{
		Connection connection = DBUtil.getConnection();
		Statement st = connection.createStatement();
		String sqlretrieve = "select * from jdbcdb.employees";
		ResultSet rs = st.executeQuery(sqlretrieve);
		while(rs.next())
		{
			int id = rs.getInt("id");
			String name = rs.getString("name");
			int salary = rs.getInt("salary");
			int bonus = rs.getInt("bonus");
			System.out.println(id + " " + name + " " + salary + " " + bonus);
		}
	}

	public static void main(String[] args) throws SQLException {
		Connection connection = DBUtil.getConnection();
		if(connection!=null)
		{
			System.out.println("JDBC:Connection is established");
		}
		//addEmployee();
		//updateEmployee();
		//deleteEmployee();
		//retrievebyidEmployee();
		retrieveallEmployee();
	}

}
