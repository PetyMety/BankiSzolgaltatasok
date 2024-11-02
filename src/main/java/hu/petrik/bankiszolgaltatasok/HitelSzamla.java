package hu.petrik.bankiszolgaltatasok;

public class HitelSzamla extends Szamla {
    private final double hitelkeret;

    public HitelSzamla(Tulajdonos tulajdonos, double hitelkeret) {
        super(tulajdonos);
        this.hitelkeret = hitelkeret;
    }

    @Override
    public boolean kivesz(double osszeg) {
        if (getEgyenleg() - osszeg >= -hitelkeret) {
            // Kivétel engedélyezve
            return true;
        }
        return false; // Kivétel nem engedélyezve
    }

    public double getHitelkeret() {
        return hitelkeret;
    }
}