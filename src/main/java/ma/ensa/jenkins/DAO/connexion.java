package ma.ensa.jenkins.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class connexion {
    private static final String link = "jdbc:mysql://localhost:3306/jenkins";
    private static final String user = "root";
    private static final String password = "";
    public static Connection connecter() throws SQLException
    {
        return DriverManager.getConnection(link,user,password);
    }

}
