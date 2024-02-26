public class Carte {
    private Titulaire titulaire;
    private long num;
    private double solde;
    private long soldecafe;
    private static int nbreTotalCarte = 0;

    Carte(Titulaire t){
        Carte.nbreTotalCarte ++;
        this.num = Carte.nbreTotalCarte;
        this.titulaire = t;
        this.solde = 0;
    }

    PlageHoraire getPlageHoraireAccesBatiment(Batiment b){
        return this.titulaire.getDroitAcces().getPlageHoraireAccesBatiment(b);
    }

    public void convertmoneytocofee(double montant){
        soldecafe += (long) (montant/0.5);
    }

    public void buyOneCoffee(){
        if(soldecafe > 0){
            System.out.println("Nouveau solde" + soldecafe);
        }
        else {
            System.out.println("Solde café insuffisant");
        }
    }

    void debit(double montant){
        if (montant > solde){
            System.out.println("Solde insuffisant");
        }
        else{
            this.solde -= montant;
            System.out.printf("Nouveau solde: %s", solde);
        }
    }
    void credit(double montant){
        this.solde += montant;
    }

    @Override
    public String toString() {
        return String.format("Carte : %s\n%s", this.num, this.titulaire);
    }
}
