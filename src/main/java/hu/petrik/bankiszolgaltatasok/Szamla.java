package hu.petrik.bankiszolgaltatasok;

public class Szamla extends BankiSzolgaltatas {
    private double egyenleg;

    public Szamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
        this.egyenleg = 0.0;
    }

    public double getEgyenleg() {
        return egyenleg;
    }

    public void befizet(double osszeg) {
        this.egyenleg += osszeg;
    }

    public boolean kivesz(double osszeg) {
        // Nem implementált metódus
        return false;
    }

    public Kartya ujKarta(String kartyaSzam) {
        return new Kartya(getTulajdonos(), this, kartyaSzam);
    }
}