package TP6.Exercice1;

public class Employe extends Personne {
    protected Double salaire;

    Employe(String nom, String prenom, Double salaire) {
        super(nom, prenom);
        this.salaire = salaire;
    }
}
