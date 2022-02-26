import java.sql.*;
import java.util.ArrayList;

public class B  {
	 public static void main(String[] args)
	 {

	
		try {
			Class .forName("com.mysql.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost/JDBC","root","");
			Statement stm = con.createStatement();
			String sql="select * from record";
			ResultSet set =stm.executeQuery(sql);
			
			ArrayList<dao> al=new ArrayList<dao>();
			while(set.next())
			{
				dao d=new dao(set.getInt(1),set.getString(2),set.getString(3),set.getString(4));
				al.add(d);
			} 
			
			for(int i=0;i<al.size();i++)
			{
				System.out.println(al.get(i).getSno());
				System.out.println(al.get(i).getName());
				System.out.println(al.get(i).getEmail());
				System.out.println(al.get(i).getPass());
				
			}
			System.out.println("Connected");
			
			
		}catch(Exception e)
		{
			System.out.println(e);
		}

	}


 }
