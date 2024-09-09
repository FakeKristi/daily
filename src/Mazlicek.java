public class Mazlicek {
    private String jmeno;
    private Druh druh;
    private int vek;
    private double vaha;

    public Mazlicek(String jmeno, Druh druh, int vek, double vaha) {
        this.jmeno = jmeno;
        this.druh = druh;
        this.vek = vek;
        this.vaha = vaha;
    }

    public String getJmeno() {
        return jmeno;
    }

    public Druh getDruh() {
        return druh;
    }

    public int getVek() {
        return vek;
    }

    public double getVaha() {
        return vaha;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public void setDruh(Druh druh) {
        this.druh = druh;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    public void setVaha(double vaha) {
        this.vaha = vaha;
    }

    @Override
    public String toString() {
        return "Jméno: "+this.jmeno+", Druh: "+this.druh+", Věk: "+this.vek+", Váha: "+this.vaha+" kg";
    }
}
