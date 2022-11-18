package TP6.Exercice1;
public class Main {
    public static void main(String[] args) {
        Employe employe1=new Employe("DOUK", "RACHID", 1000.0);
        Employe employe2=new Employe("BNE SALEH", "ALI", 855.0);

        Etudiant etud1=new Etudiant("FRAJ", "med Amin", "589372034");
        Etudiant etud2=new Etudiant("AMEUR", "Meriem", "589372034");

        Professeur prof1=new Professeur("ALAOUI", "Haythem", 2700.0, "JAVA/JEE");
        Professeur prof2=new Professeur("BEN CHEIKH", "Hana", 3200.0, "Mathematique");

        System.out.println("---- La liste des empoloyés : ----");
        System.out.println("-" + employe1.toString());
        System.out.println("-" + employe2.toString());
        System.out.println("---- La liste des Étudiants : ----");
        System.out.println("-" + etud1.toString());
        System.out.println("-" + etud2.toString());
        System.out.println("---- La liste des Professeurs : ----");
        System.out.println("-" + prof1.toString());
        System.out.println("-" + prof2.toString());
    }
}
