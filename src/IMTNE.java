import java.time.LocalTime;
import java.util.ArrayList;

public class IMTNE {
    ArrayList<Batiment> lesBatiments = new ArrayList<Batiment>();
    DroitAcces eleves = new DroitAcces();
    DroitAcces personnel = new DroitAcces();

    IMTNE(){
        creerIMTNordEurope();
        creerDroitsEleves();
        creerDroitsPersonnel();
    }

    public void creerIMTNordEurope(){
        lesBatiments.add(new Batiment("Laplace", "Borseul"));
        lesBatiments.add(new Batiment("Newton", "Borseul"));
        lesBatiments.add(new Batiment("CERI SN", "Lahure"));
        lesBatiments.add(new Batiment("CERI SN", "VdA"));
        lesBatiments.add(new Batiment("GC1", "Lahure"));
        lesBatiments.add(new Batiment("GC1", "Lahure"));
        lesBatiments.add(new Batiment("GC1", "Lahure"));
        lesBatiments.add(new Batiment("Batiment Central", "Lahure"));
    }

    public void creerDroitsPersonnel(){
        PlageHoraire p = new PlageHoraire(LocalTime.of(8, 0), LocalTime.parse("21:00"), true);
        for(Batiment b : this.lesBatiments){
            personnel.ajouteDroits(b, p);
        }
    }

    public void creerDroitsEleves(){
        PlageHoraire p = new PlageHoraire(LocalTime.of(8, 0), LocalTime.parse("19:00"), false);
        for(Batiment b : this.lesBatiments){
            eleves.ajouteDroits(b, p);
        }
    }
    public DroitAcces getEleves() {
        return eleves;
    }

    public DroitAcces getPersonnel() {
        return personnel;
    }
}
