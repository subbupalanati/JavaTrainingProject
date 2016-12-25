import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class jdbc_TranscationManagement {

  
public static void main(String args[]){  
try{  
  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/subbu","root","root");  
con.setAutoCommit(false);  
  
PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?)");  
  
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
while(true){  
  
System.out.println("enter id");  
String s1=br.readLine();  
int id=Integer.parseInt(s1);  
  
System.out.println("enter name");  
String name=br.readLine();  
  
System.out.println("enter class");  
String Class=br.readLine();  
System.out.println("enter marks");  
String s2=br.readLine();  
int marks=Integer.parseInt(s2);  
 
 
ps.setInt(1,id);  
ps.setString(2,name);  
ps.setString(3,Class);  
ps.setInt(4, marks);
ps.executeUpdate();  

  
System.out.println("commit/rollback");  
String answer=br.readLine();  
if(answer.equals("commit")){  
con.commit();  
}  
if(answer.equals("rollback")){  
con.rollback();  
}  
  
  
System.out.println("Want to add more records y/n");  
String ans=br.readLine();  
if(ans.equals("n")){  
break;  
}  
  
}  
con.commit();  
System.out.println("record successfully saved");  
  
con.close();//before closing connection commit() is called  
}catch(Exception e){System.out.println(e);}  
  
}}  