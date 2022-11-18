package TP6.Exercice1;

public class Personne {
    protected int id;
    protected String nom;
    protected String prenom;

    Personne(String nom, String prenom) {
        id ++;
        this.nom = nom;
        this.prenom = prenom; 
    }
    
}
