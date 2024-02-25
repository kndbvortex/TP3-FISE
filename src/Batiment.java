public class Batiment {
    private String nom;
    private String localisation;

    Batiment(String nom, String localisation ){
        this.nom = nom;
        this.localisation = localisation;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return String.format("%s (%s)", this.nom, this.localisation);
    }
}
