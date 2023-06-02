import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Pracownik pracownik1 = new Pracownik("John", "Doe", "Manager", 1, 75000);
        Pracownik pracownik2 = new Pracownik("Jane", "Smith", "Accountant", 2, 60000);
        Pracownik pracownik3 = new Pracownik("Michael", "Johnson", "Accountant", 3, 55000);
        Pracownik pracownik4 = new Pracownik("Emily", "Jones", "Marketing Specialist", 4, 50000);
        Pracownik pracownik5 = new Pracownik("David", "Brown", "Accountant", 5, 45000);
        Pracownik pracownik6 = new Pracownik("Laura", "Taylor", "Human Resources Manager", 6, 70000);
        Pracownik pracownik7 = new Pracownik("Kevin", "Wilson", "IT Specialist", 7, 60000);
        Pracownik pracownik8 = new Pracownik("Samantha", "Davis", "Customer Service Representative", 8, 40000);

        HashMap<Integer,Pracownik> pracownikHashMap = new HashMap<>();
        MenadzerPracownikow menadzerPracownikow = new MenadzerPracownikow(pracownikHashMap);
        menadzerPracownikow.dodajPracownika(pracownik1);
        menadzerPracownikow.dodajPracownika(pracownik2);
        menadzerPracownikow.dodajPracownika(pracownik3);
        menadzerPracownikow.dodajPracownika(pracownik4);
        menadzerPracownikow.dodajPracownika(pracownik5);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (true)
        {
            System.out.println("1.Dodaj pracownika");
            System.out.println("3.Zaktualizuj dane o pracowniku");
            System.out.println("4.Wyszukaj pracownika po ID");
            System.out.println("5.Wyświetl liste wszystkich pracownikow");
            System.out.println("6.Wyszukaj pracownika po pozycji");
            System.out.println("Inna wartosc zakonczy program");
            int input = Integer.parseInt(bufferedReader.readLine());
            switch (input){
                case 1: {
                    menadzerPracownikow.dodajPracownika(pracownik7);
                    break;

                }
                case 3:
                {
                    int id = Integer.parseInt(bufferedReader.readLine());
                    Pracownik pracownik = menadzerPracownikow.znajdzPracownikaPrzezId(id);
                    if(pracownik != null){
                        pracownik.setPensja(10000);
                        menadzerPracownikow.zaktualizujPracownika(id,pracownik);}
                    break;

                }
                case 4:
                {
                    int id = Integer.parseInt(bufferedReader.readLine());
                    Pracownik pracownik = menadzerPracownikow.znajdzPracownikaPrzezId(id);
                    System.out.println(pracownik);
                    break;
                }
                case 5:
                {
                    menadzerPracownikow.listaWszystkichPracowników();
                    break;
                }
                case 6:
                {
                    String pozycja = bufferedReader.readLine();
                    HashSet<Pracownik> employeeHashSet = menadzerPracownikow.szukajPracownikowPrzezPozycje(pozycja);
                    for (Pracownik pracownik: employeeHashSet
                    ) {
                        System.out.println(pracownik);
                    }
                    break;

                }
                default:
                    System.exit(0);
            }
        }
    }
}