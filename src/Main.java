import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Batiment b = new Batiment("Laplace", "Borseul");
//        Batiment b1 = new Batiment("Newton", "Borseul");
//        Batiment b2 = new Batiment("CERI SN", "Lahure");
//        PlageHoraire p = new PlageHoraire(LocalTime.parse("08:00"), LocalTime.parse("21:00"), true);
//        PlageHoraire p1 = new PlageHoraire(LocalTime.parse("08:00"), LocalTime.parse("21:00"), false);
//        DroitAcces imt = new DroitAcces();
//        imt.ajouteDroits(b, p);
//        imt.ajouteDroits(b1, p1);
//
//        Titulaire t = new Titulaire("Kamga", "Durande", imt);
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        Eleve e = new Eleve("Kamga", "Durande", imt, LocalDate.parse("30/09/2025", fmt2));
//        Personnel per = new Personnel("Kamga", "Durande", imt, LocalDate.parse("30/09/2025", fmt2));
//        Carte c = new Carte(per);


        IMTNE imtne = new IMTNE();
        Eleve e1 = new Eleve("Nguifo", "Berluskoni", imtne.getEleves(), LocalDate.parse("30/09/2025", fmt2));
        Carte c2 = new Carte(e1);
        c2.debit(20);
        c2.credit(20);
        c2.debit(20);




//        System.out.println(b);
//        System.out.println(p);
//        System.out.println(p.estDansLaPlage(LocalDateTime.now()));
//        System.out.println(imt);
//        System.out.println(t);
//        System.out.println(e);
//        System.out.println(per);
//        System.out.println(c);
    }
}