import java.util.HashMap;

public class MenadzerPracownikow {

    private final HashMap<Integer,Pracownik> pracownicy;

    public MenadzerPracownikow(HashMap<Integer, Pracownik> pracownicy) {
        this.pracownicy = pracownicy;
    }

    public  void dodajPracownika(Pracownik pracownik){
        Integer keyPracownik = pracownik.getIdPracownika();
        pracownicy.put(keyPracownik,pracownik);
    }

    public void usunPracownika(Pracownik pracownik){
        if(pracownicy.containsKey(pracownik.getIdPracownika()))
            pracownicy.remove(pracownik.getIdPracownika());
        else
            System.out.println("Pracownik o takim ID nie istnieje");
    }

    public void zaktualizujPracownika(int idPracownika, Pracownik nowyPracownik){
        if(pracownicy.containsKey(idPracownika))
        {
            pracownicy.put(idPracownika,nowyPracownik);
        }
        else
            System.out.println("Pracownik o takim ID nie istnieje");
    }

    public Pracownik znajdzPracownikaPrzezId(int idPracownika) {
        if(pracownicy.containsKey(idPracownika)){
            return pracownicy.get(idPracownika);
        }
        else
            System.out.println("Nie znaleziono pracownika o danym ID");
        return null;
    }
}
