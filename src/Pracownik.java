public class Pracownik {
    private String imie;
    private String nazwisko;
    private String pozycja;
    private int idPracownika;
    private int pensja;

    public Pracownik(String imie, String nazwisko, String pozycja, int idPracownika, int pensja) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pozycja = pozycja;
        this.idPracownika = idPracownika;
        this.pensja = pensja;
    }

    public String getPozycja() {
        return pozycja;
    }

    public int getIdPracownika() {
        return idPracownika;
    }

    @Override
    public String toString() {
        return "Pracownik: " +
                "imie = '" + imie + '\'' +
                ", nazwisko = '" + nazwisko + '\'' +
                ", pozycja = '" + pozycja + '\'' +
                ", idPracownika = " + idPracownika +
                ", pensja = " + pensja;
    }

    public void setPensja(int pensja) {
        this.pensja = pensja;
    }
}
