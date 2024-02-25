import java.util.LinkedHashMap;
import java.util.Map;

public class DroitAcces {
    private LinkedHashMap<Batiment, PlageHoraire> droits = new LinkedHashMap<Batiment, PlageHoraire>();

    public void ajouteDroits(Batiment b, PlageHoraire p){
        this.droits.put(b, p);
    }

    @Override
    public String toString() {
        String s = "";
        for (Map.Entry<Batiment, PlageHoraire> d: this.droits.entrySet()){
            s += String.format("%s : %s\n", d.getKey(), d.getValue());
        }
        return s;
    }

    PlageHoraire getPlageHoraireAccesBatiment(Batiment b){
        return this.droits.get(b);
    }
}
