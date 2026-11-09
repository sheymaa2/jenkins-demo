package ma.ensa.jenkins.DAO;

import ma.ensa.jenkins.models.etudiant;

import java.sql.*;

public class Etudiant {
    public static boolean insert(etudiant student)
    {
        Connection cnx;
        try {
            cnx = connexion.connecter();
            Statement stm = cnx.createStatement();
            String sql = "INSERT INTO etudiant(nom,prenom,mail,CIN,appogee)" +
                    "VALUES ('"+student.getName()+"','"+student.getPrenom()+"','"+student.getMail()+"','"+student.getCIN()+"',"
                    +student.getApogee()+")";
            int rows = stm.executeUpdate(sql);
            cnx.close();
            return rows == 1;

        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean verify(etudiant e) {
        String sql = "SELECT 1 FROM etudiant WHERE mail = ? AND cin = ? AND appogee = ?";
        try (Connection cn = connexion.connecter();
             PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setString(1, e.getMail());
            ps.setString(2, e.getCIN());
            ps.setLong(3, e.getApogee());
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        } catch (SQLException ex) {
            System.out.println("Erreur SQL (vérification) : " + ex.getMessage());
            return false;
        }
    }
}
