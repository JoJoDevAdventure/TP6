package TP6.Exercice2;

public class Developpeur extends Personne {

    private String specialite;

    Developpeur(String nom, String prenom, String mail, String telephone, Double salaire, String specialite) {
        super(nom, prenom, mail, telephone, salaire);
        super.salaire = calculerSalaire();
        this.specialite = specialite;
    }

    @Override
    Double calculerSalaire() {
        return super.salaire + super.salaire * 0.35;
    }

    void Afficher() {
        System.out.println("le salaire du dev " + super.nom + super.prenom + " est : " + salaire + " et spécialité  est :" + specialite);
    }
}
