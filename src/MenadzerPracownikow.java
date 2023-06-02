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
}
