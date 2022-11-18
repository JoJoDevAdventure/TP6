package TP6.Exercice2;

public class Manager extends Personne {

    private String service;

    Manager(String nom, String prenom, String mail, String telephone, Double salaire, String service) {
        super(nom, prenom, mail, telephone, salaire);
        super.salaire = calculerSalaire();
        this.service = service;
    }

    @Override
    Double calculerSalaire() {
        return super.salaire + super.salaire * 0.35;
    }
    
    void Afficher() {
        System.out.println("le salaire du manager " + super.nom + super.prenom + " est : " + salaire + " et son service  est :" + service);
    }
}
