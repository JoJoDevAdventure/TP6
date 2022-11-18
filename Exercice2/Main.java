package TP6.Exercice2;

public class Main {
    public static void main(String[] args) {
        Developpeur dev=new Developpeur("BADRI", "Yesser", "yesserBadri@gmail.com", "28 408 778", 3000.0, "Java");
        
        Manager man=new Manager("BOUIN", "Kamel", "bouinKamel@gmail.com", "53 524 234", 2500.0, "Moudir");

        dev.Afficher();
        man.Afficher();
    }
}
