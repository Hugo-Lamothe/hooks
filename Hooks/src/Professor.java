public class Professor {
    String nom;
    String prenom;
    Matiere matiere;
    Boolean dispo;

    Professor(String nom, String prenom, Matiere matiere){
        this.nom = nom;
        this.prenom = prenom;
        this.matiere = matiere;
        dispo = true;
    }

    public void startCourse(){
        dispo = false;
    }

    public void endCourse(){
        dispo = true;
    }
}
