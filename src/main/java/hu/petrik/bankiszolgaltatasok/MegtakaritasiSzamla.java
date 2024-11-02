package hu.petrik.bankiszolgaltatasok;

public class MegtakaritasiSzamla extends Szamla {
    private double kamat;

    private static final double ALAPKAMAT = 1.1;

    public MegtakaritasiSzamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
        this.kamat = ALAPKAMAT;
    }

    public double getKamat() {
        return kamat;
    }

    @Override
    public boolean kivesz(double osszeg) {
        if (getEgyenleg() - osszeg >= 0) {
            // Kivétel engedélyezve
            return true;
        }
        return false; // Kivétel nem engedélyezve
    }

    public void kamatJovairas() {
        double ujEgyenleg = getEgyenleg() * kamat;
        befizet(ujEgyenleg);
    }
}
