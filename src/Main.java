//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var esprit =new Ecole("esprit",15);
        var Tekup =new Ecole("tekup",15);
        var omar = new Etudiant3(129, "omar", "bennani", 8.5f, "Informatique");
        var yacine=new Etudiant3(127,"yacine","daoudi",10.5f,"it");
        var sara = new Etudiant3(128, "sara", "benomar", 9.0f, "IT");
        var imane = new Etudiant3(130, "imane", "rahali", 7.5f, "Business");
        var hamza = new Etudiant3(131, "hamza", "elmalki", 6.0f, "Marketing");
        var mohamed = new Etudiant3(132, "mohamed", "chaoui", 11.0f, "Design");
        var khadija = new Etudiant3(133, "khadija", "zaidi", 8.0f, "Finance");
        var mehdi = new Etudiant3(134, "mehdi", "karimi", 9.5f, "IT");
        var salma = new Etudiant3(135, "salma", "elalami", 10.0f, "Informatique");
        var islam = new Etudiant3(136, "islam", "majdoubi", 7.0f, "Engineering");
        esprit.ajouterEtudiant(yacine);
        esprit.ajouterEtudiant(sara);
        esprit.ajouterEtudiant(omar);
        esprit.ajouterEtudiant(imane);
        esprit.ajouterEtudiant(hamza);
        esprit.ajouterEtudiant(mohamed);
        esprit.ajouterEtudiant(khadija);
        esprit.ajouterEtudiant(mehdi);
        esprit.ajouterEtudiant(salma);
        esprit.ajouterEtudiant(islam);
        System.out.println(esprit.getMoyenne3a());
        System.out.println(esprit);
//        System.out.println(esprit.etudiantcount);
//        System.out.println(yacine.equals(yacine));
//        System.out.println(esprit.recherch(yacine));
//        System.out.println(esprit.recherch(sara));
//
//        System.out.println(esprit.recherch(yacine));
        System.out.println("###############");
     //   System.out.println(esprit.etudiantcount);
        esprit.changerEcole(sara,Tekup);
        System.out.println(Tekup.recherch(sara));
        System.out.println(Tekup.recherch(yacine));
        esprit.changerEcole(yacine,Tekup);
        System.out.println(Tekup.recherch(yacine));
        System.out.println(esprit);

        System.out.println(esprit);

        System.out.println(Tekup);

    }
}


































