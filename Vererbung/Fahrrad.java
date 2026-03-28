package Vererbung;

public class Fahrrad extends Fahrzeug {
    private boolean hatKlingel;
    public Fahrrad(String marke, int baujahr, boolean hatKlingel) {
        super(marke, baujahr);
        this.hatKlingel = hatKlingel;
    }

    @Override
    public String info() {
        return super.info() + ", Hat Klingel: " + (hatKlingel ? "Ja" : "Nein");
    }
}
