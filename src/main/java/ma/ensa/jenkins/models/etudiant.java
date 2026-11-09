package ma.ensa.jenkins.models;

public class etudiant {
    private String name;
    private String prenom;
    private String mail;
    private String CIN;
    private long apogee;
    public etudiant(String name, String prenom, String CIN, String mail, long apogee)
    {
        this.name = name;
        this.prenom = prenom;
        this.CIN = CIN;
        this.mail = mail;
        this.apogee = apogee;
    }

    public String getName() {
        return name;
    }

    public long getApogee() {
        return apogee;
    }

    public String getCIN() {
        return CIN;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setCIN(String CIN) {
        this.CIN = CIN;
    }

    public void setApogee(long apogee) {
        this.apogee = apogee;
    }

    public String getMail() {
        return mail;
    }

    public String getPrenom() {
        return prenom;
    }
}
