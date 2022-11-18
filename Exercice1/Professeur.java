package TP6.Exercice1;

public class Professeur extends Employe {
    private String specialite;

    Professeur(String nom, String prenom, Double salaire, String specialite) {
        super(nom, prenom, salaire);
        this.specialite = specialite;
    }
}
