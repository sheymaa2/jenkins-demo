package ma.ensa.jenkins.controller;

import java.lang.reflect.Array;
import java.sql.SQLException;
import java.util.List;

import ma.ensa.jenkins.DAO.Etudiant;
import ma.ensa.jenkins.models.etudiant;
import ma.ensa.jenkins.DAO.connexion;
public class etudiantManip {

    public static boolean verifyBackendInsertionMail(String str)
    {
        return str != null && str.matches("^[A-Za-z0-9._+-]+@[A-Za-z0-9]+\\.[A-Za-z0-9]+$");
    }

    public static boolean verifyBackendInsertionCIN(String str)
    {
        return str != null && str.matches("^[A-Z]{1,2}[0-9]{5,6}$");
    }

    public static boolean verifyAppogee(long appogee)
    {
        return appogee >= 10_000_000L || appogee <= 99_999_999L;
    }


    public static boolean donneesValides(etudiant e)
    {
        return verifyBackendInsertionMail(e.getMail())
                && verifyAppogee(e.getApogee())
                && verifyBackendInsertionCIN(e.getCIN());
    }

    public static boolean add(etudiant etudiant) throws SQLException
    {
        if(verifyBackendInsertionMail(etudiant.getMail()) && verifyAppogee(etudiant.getApogee()) && verifyBackendInsertionCIN(etudiant.getCIN()))
        {
            return Etudiant.insert(etudiant);
        }
        return false;


    }

    public static boolean verify(etudiant etudiant)
    {
        if (donneesValides(etudiant))
        {
            return Etudiant.verify(etudiant);
        }
        return false;
    }
}
