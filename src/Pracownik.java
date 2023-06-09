public class Pracownik {
    private String imie;
    private String nazwisko;
    private String pozycja;
    private int idPracownika;
    private int pensja;

    public Pracownik(String imie, String nazwisko, String pozycja, int pensja) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pozycja = pozycja;
        this.idPracownika++;
        this.pensja = pensja;
    }

    public String getPozycja() {
        return pozycja;
    }

    public int getIdPracownika() {
        return idPracownika;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getPensja() {
        return pensja;
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

    public void setPozycja(String pozycja) {
        this.pozycja = pozycja;
    }
}
