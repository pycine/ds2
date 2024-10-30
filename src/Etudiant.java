public  class Etudiant {
    private int id;
    private String nom;
    private String prenom;
    protected float moyenne;
    public Etudiant(int id,String nom,String prenom,float moyenne){
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;

        this.moyenne=moyenne;

    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Etudiant))
            return false;
        Etudiant other =(Etudiant) obj;
        return other.id==id && other.nom==nom && other.prenom==prenom;
    }
    @Override
    public String toString(){
        return "id= "+id+" |nom= "+nom+" |prenom= "+prenom+"\n";

    }


    public void ajouterUneAbsence() {

    }


}
