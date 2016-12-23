import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc_example {

	public static void main(String[] args) {
		
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/subbu","root","root");  
			Statement stmt=con.createStatement();  
			//1. creating the student table 
			String query1 ="CREATE TABLE student(id int(10),name varchar(10),class varchar(10),marks int(10))";
				     stmt.execute(query1);
				      System.out.println("student table created");
				      // inserting two records into the student table 
				      String query2="insert into student(id,name,class,marks)values(10,'subbu','ms',91)";
				      stmt.execute(query2);
				      System.out.println("one row created");
				      String query3="insert into student(id,name,class,marks)values(11,'siva','ms',95)";
				      stmt.execute(query3);
				      System.out.println("two rows created");
				   // Select operation/ displaying content in the table 
				      System.out.println("before update student table contents are :");
				      ResultSet rs=stmt.executeQuery("select * from student");  
						while(rs.next())  
						System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getInt(4));  
						 // updating the marks filed for subbu 
					      String query4="update student set marks=98 where id=10";
						stmt.executeUpdate(query4);
				      String query5="update student set marks=98 where id=10";
				      System.out.println("after update student table contents are ");
			 rs=stmt.executeQuery("select * from student");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getInt(4));  
			// delete operation 
		String query6="delete from student where id=11"; 
		stmt.executeUpdate(query6);
		System.out.println("after Delete student table contents are ");
		 rs=stmt.executeQuery("select * from student");  
		while(rs.next())  
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getInt(4));
		con.close();
			}
		catch(Exception e){ System.out.println(e);}  
	}

	}
  
