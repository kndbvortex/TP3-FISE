import java.time.LocalDate;

public class Titulaire {
    protected String nom;
    protected String prenom;
    protected DroitAcces droitAcces;

    Titulaire(String nom, String prenom, DroitAcces droitAcces){
        this.nom = nom;
        this.prenom = prenom;
        this.droitAcces = droitAcces;
    }

    @Override
    public String toString() {
        return  String.format("Titulaire : %s %s\n%s", this.prenom, this.nom, this.droitAcces);
    }

    public DroitAcces getDroitAcces() {
        return droitAcces;
    }
}

class Eleve extends Titulaire{
    LocalDate finScolarite;
    Eleve(String nom, String prenom, DroitAcces droitAcces, LocalDate f){
        super(nom, prenom, droitAcces);
        this.finScolarite = f;
    }

    @Override
    public String toString() {
        return String.format("%sFin de scolarite : %s", super.toString(), this.finScolarite.toString());
    }
}

class Personnel extends Titulaire{
    LocalDate finContrat;
    Personnel(String nom, String prenom, DroitAcces droitAcces, LocalDate f){
        super(nom, prenom, droitAcces);
        this.finContrat = f;
    }

    @Override
    public String toString() {
        return String.format("%sFin de contrat : %s", super.toString(), this.finContrat.toString());
    }
}
