package TP6.Exercice2;

public abstract class Personne {
    protected int id;
    protected String nom;
    protected String prenom;
    protected String mail;
    protected String telephone;
    protected Double salaire;

    abstract Double calculerSalaire();

    Personne(String nom, String prenom, String mail, String telephone, Double salaire) {
        id ++;
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.telephone = telephone;
        this.salaire = salaire;
    }
}
