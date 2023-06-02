import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

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

    public void listaWszystkichPracowników(){
        ArrayList<Pracownik> listaPracownikow = new ArrayList<>(pracownicy.values());
        for (Pracownik employee: listaPracownikow
        ) {
            System.out.println(employee);
        }
    }

    public HashSet<Pracownik> szukajPracownikowPrzezPozycje(String pozycja){
        HashSet<Pracownik> listaPracownikow = new HashSet<>(pracownicy.values());
        Iterator<Pracownik> pracownicyIterator = listaPracownikow.iterator();
        while(pracownicyIterator.hasNext())
        {
            Pracownik employee = pracownicyIterator.next();
            if(!employee.getPozycja().equals(pozycja))
                pracownicyIterator.remove();
        }
        return listaPracownikow;
    }
}
