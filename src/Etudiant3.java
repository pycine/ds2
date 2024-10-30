public class Etudiant3 extends Etudiant{
    private String branche;
    public Etudiant3 (int id ,String nom,String prenom,float moyenne ,String branche){
        super(id,nom,prenom,moyenne);
        this.branche=branche;
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    public void ajouterUneAbsence() {
        if(moyenne>=0.5)
            moyenne= (float) (moyenne-0.5); ///////////////revision
        else moyenne=0;
    }
}
