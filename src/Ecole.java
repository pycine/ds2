public class Ecole {
    private int etudiantcount=0;
    private int size=500;
    private String nom;
    private Etudiant[] etudiants;
    public Ecole(String nom,int size){
        this.nom=nom;
        this.size=size;
        etudiants=new Etudiant[size];
    }
    public void ajouterEtudiant(Etudiant e){
        if (etudiantcount<500){
            etudiants[etudiantcount]=e;
            etudiantcount++;
        }
        else System.out.println("out of space");
    }
    public float getMoyenne3a(){
        float total = 0;
        int num=0;
        for (int i = 0; i <etudiantcount ; i++) {
            if (etudiants[i]instanceof Etudiant3){
                num++;
                total=total+etudiants[i].moyenne;


            }


        }
        float moy=total/num;
        return moy;
    }

    public int moyennesalire(){
        int num=0;
        int total=0;
        for (int i = 0; i <etudiantcount ; i++) {
            if(etudiants[i] instanceof Etudiantalt){
                total=total+((Etudiantalt) etudiants[i]).salaire; ////
                num++;

            }
        }
        int moy=total/num;
        return moy;
    }
    @Override
    public String toString() {
        StringBuilder info = new StringBuilder();
        for (int i = 0; i < etudiantcount; i++) {
            if (etudiants[i] != null) { // Check for null
                info.append(etudiants[i].toString()).append("\n");
            } else {
                info.append("Etudiant at index ").append(i).append(" is null\n");
            }
        }
        return nom + "\n" + info.toString();
    }

    public int recherch(Etudiant e){
        for (int i = 0; i <=etudiantcount ; i++) {
            if (e.equals(etudiants[i]))
                return i;


        }
        return -1;
    }
    public void changerEcole(Etudiant etd, Ecole e) {
        int index = recherch(etd);

        if (index != -1) { // Student exists in this school
            // Shift students to the left to remove the student
            for (int i = index; i < etudiantcount - 1; i++) {
                etudiants[i] = etudiants[i + 1];
            }

            // Set the last student reference to null
            etudiants[etudiantcount - 1] = null;
            etudiantcount--; // Decrement the count

            // Add the student to the new school
            e.ajouterEtudiant(etd);
        } else {
            System.out.println("Student not found in this school.");
        }
    }}

