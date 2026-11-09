package ma.ensa.jenkins;
import java.sql.SQLException;
import java.util.Scanner;

import ma.ensa.jenkins.controller.etudiantManip;
import ma.ensa.jenkins.models.etudiant;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws SQLException
    {

        do
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("=========Entrer votre choix:========");
            System.out.println("1) Ajouter un etudiant à la base de données");
            System.out.println("2) Verification de l'existance de l'etudiant ");
            int choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.print("Entrer le nom:  ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.print("Entrer le prenom:  ");
                    String prenom = sc.nextLine();
                    System.out.print("Entrer le CIN( 8 caracteres maximum debutant par une lettre):  ");
                    String CIN = sc.nextLine();
                    System.out.print("Entrer le numero appogee ( 8 chiffres):  ");
                    long appogee = sc.nextLong();
                    System.out.print("Entrer l'email:  ");
                    sc.nextLine();
                    String mail = sc.nextLine();
                    System.out.println(etudiantManip.add(new etudiant(name,prenom,CIN,mail,appogee))? "Etudiant ajouté" : "Erreur insertion veillez vous s'assurer du format entré");
                    break;
                case 2 :
                    System.out.print("Entrer le nom:  ");
                    sc.nextLine();
                    String nameV = sc.nextLine();
                    System.out.print("Entrer le prenom:  ");
                    String prenomV = sc.nextLine();
                    System.out.print("Entrer le CIN:  ");
                    String CINV = sc.nextLine();
                    System.out.print("Entrer le numero appogee:  ");
                    long appogeeV = sc.nextLong();
                    System.out.print("Entrer l'email:  ");
                    sc.nextLine();
                    String mailV = sc.nextLine();
                    System.out.println(etudiantManip.verify(new etudiant(nameV,prenomV,CINV,mailV,appogeeV))? "Etudiant existant" : "Etudiant inexistant");
                    break;

            }
        }while (true);
    }
}