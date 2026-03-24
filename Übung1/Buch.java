package Übung1;
public class Buch {
    private String titel;
    private String autor;
    private Benutzer benutzer;

    public Buch(String titel) {
        this(titel, "");
    }

    public Buch(String titel, String autor) {
        this.titel = titel;
        this.autor = autor;
        this.benutzer = null;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Benutzer getBenutzer() {
        return benutzer;
    }

    public void setBenutzer(Benutzer benutzer) {
        this.benutzer = benutzer;
    }
}
