package main.java;

public class Professor {
    String nom;
    String prenom;
    Matiere matiere;
    public Boolean dispo;

    public Professor(String nom, String prenom, Matiere matiere){
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
