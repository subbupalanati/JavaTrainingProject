import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class jdbc_BatchProcessing {
	public static void main(String args[]){  
		try{  
		  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/subbu","root","root");  
		PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?)");  
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
		while(true){  
		System.out.println("enter student id");  
		String s1=br.readLine();  
		int id=Integer.parseInt(s1);  
		  
		System.out.println("enter student name");  
		String name=br.readLine();  
		  
		System.out.println("enter class");  
		String Class=br.readLine();  
		System.out.println("enter student marks");  
		String s2=br.readLine();  
		int marks=Integer.parseInt(s2);  
		ps.setInt(1,id);  
		ps.setString(2,name);  
		ps.setString(3,Class);  
		ps.setInt(4, marks);
		
		ps.addBatch();  
		System.out.println("Want to add more records y/n");  
		String ans=br.readLine();  
		if(ans.equals("n")){  
		break;  
		}  
		  
		}  
		ps.executeBatch();  
		  
		System.out.println("record successfully saved");  
		  
		con.close();  
		}catch(Exception e){System.out.println(e);}  
		  
		}}  
