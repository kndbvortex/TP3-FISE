import java.time.LocalDateTime;
import java.time.LocalTime;

public class PlageHoraire {
    LocalTime debut;
    LocalTime fin;
    boolean accesWeekend;

    PlageHoraire(LocalTime d, LocalTime f, boolean accesWeekend){
        this.debut = d;
        this.fin = f;
        this.accesWeekend = accesWeekend;
    }

    boolean estDansLaPlage(LocalDateTime i){
        int d = i.getDayOfWeek().getValue();
        if((d > 5) && (!this.accesWeekend))
            return false;
        LocalTime t = i.toLocalTime();
        return t.isAfter(this.debut) && t.isBefore(this.fin);
    }

    @Override
    public String toString() {
        String s = accesWeekend ? "tous les jours": "sauf le weekend";
        return String.format("Accès de %s à %s %s", this.debut, this.fin, s);
    }
}