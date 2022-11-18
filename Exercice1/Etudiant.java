package TP6.Exercice1;

public class Etudiant extends Personne {
    private String cne;

    Etudiant(String nom, String prenom, String cne) {
        super(nom, prenom);
        this.cne = cne;
    }
}
