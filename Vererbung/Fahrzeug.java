package Vererbung;

public class Fahrzeug {
    private String marke;
    private int baujahr;

    public Fahrzeug(String marke, int baujahr) {
        this.marke = marke;
        this.baujahr = baujahr;
    }

    public String info() {
        return marke + ", Baujahr: " + baujahr;
    }
}
