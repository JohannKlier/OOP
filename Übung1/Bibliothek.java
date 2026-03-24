import java.util.ArrayList;
import java.util.List;

public class Bibliothek {
    private String name;
    private List<Buch> buecher;
    private List<Benutzer> benutzer;

    public Bibliothek(String name) {
        this.name = name;
        this.buecher = new ArrayList<>();
        this.benutzer = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addBuch(Buch bu) {
        if (bu != null && !buecher.contains(bu)) {
            buecher.add(bu);
        }
    }

    public void removeBuch(Buch bu) {
        if (bu != null) {
            buecher.remove(bu);
        }
    }

    public void addBenutzer(Benutzer be) {
        if (be != null && !benutzer.contains(be)) {
            benutzer.add(be);
        }
    }

    public void removeBenutzer(Benutzer be) {
        if (be != null) {
            benutzer.remove(be);
        }
    }

    public boolean ausleihen(Benutzer be, Buch bu) {
        if (be == null || bu == null) {
            return false;
        }
        if (!benutzer.contains(be) || !buecher.contains(bu)) {
            return false;
        }
        if (bu.getBenutzer() != null) {
            return false;
        }
        if (getBuecherFuerBenutzer(be).size() >= be.getMaximumBuecher()) {
            return false;
        }

        bu.setBenutzer(be);
        return true;
    }

    public boolean zurueckgeben(Buch bu) {
        if (bu == null || !buecher.contains(bu) || bu.getBenutzer() == null) {
            return false;
        }

        bu.setBenutzer(null);
        return true;
    }

    public List<Buch> getBuecherFuerBenutzer(Benutzer be) {
        List<Buch> ausgelieheneBuecher = new ArrayList<>();
        for (Buch buch : buecher) {
            if (buch.getBenutzer() == be) {
                ausgelieheneBuecher.add(buch);
            }
        }
        return ausgelieheneBuecher;
    }

    public List<Buch> getVerfuegbareBuecher() {
        List<Buch> verfuegbareBuecher = new ArrayList<>();
        for (Buch buch : buecher) {
            if (buch.getBenutzer() == null) {
                verfuegbareBuecher.add(buch);
            }
        }
        return verfuegbareBuecher;
    }

    public List<Buch> getAusgelieheneBuecher() {
        List<Buch> ausgelieheneBuecher = new ArrayList<>();
        for (Buch buch : buecher) {
            if (buch.getBenutzer() != null) {
                ausgelieheneBuecher.add(buch);
            }
        }
        return ausgelieheneBuecher;
    }
}
