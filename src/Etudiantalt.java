public class Etudiantalt extends Etudiant {
    protected int  salaire;
    public Etudiantalt(int id,String nom, String prenom,float moyenne,int salaire){
        super(id,nom,prenom,moyenne);
        this.salaire=salaire;
    }
    @Override
    public void ajouterUneAbsence()  {
        salaire=salaire-50;
    }
    @Override
    public String toString(){
        return super.toString()+"salaire="+salaire;

    }

}
