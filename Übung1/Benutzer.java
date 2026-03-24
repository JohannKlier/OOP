package Übung1;
public class Benutzer {
    private int matrikelNr;
    private int maximumBuecher;

    public Benutzer(int nummer, int anzahl) {
        this.matrikelNr = nummer;
        this.maximumBuecher = anzahl;
    }

    public int getMatrikelNr() {
        return matrikelNr;
    }

    public void setMatrikelNr(int nummer) {
        this.matrikelNr = nummer;
    }

    public int getMaximumBuecher() {
        return maximumBuecher;
    }

    public void setMaximumBuecher(int anzahl) {
        this.maximumBuecher = anzahl;
    }
}
