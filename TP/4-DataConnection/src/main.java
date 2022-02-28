import java.sql.*;

public class main
{
	public static void main(String[] args)
	{
		
		// Declaration du pilote JDBC
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        }
        catch(Exception E)
        {
            System.err.println("Pilote introuvable !");
        }
        
        // Connexion a la base de donnees
        try
        {
        	String url = "jdbc:sqlserver://localhost/TD4-1";
        	Connection conn = DriverManager.getConnection(url);
        	
        	// Utilisation de la base de donnees
        }
        catch(SQLException E)
        {
        	System.err.println(E.getMessage());
        }

	}

}
