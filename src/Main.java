import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pracownik pracownik1 = new Pracownik("John", "Doe", "Manager", 75000);
        Pracownik pracownik2 = new Pracownik("Jane", "Smith", "Accountant", 60000);
        Pracownik pracownik3 = new Pracownik("Michael", "Johnson", "Accountant", 55000);
        Pracownik pracownik4 = new Pracownik("Emily", "Jones", "Marketing Specialist", 50000);
        Pracownik pracownik5 = new Pracownik("David", "Brown", "Accountant", 45000);
        Pracownik pracownik6 = new Pracownik("Laura", "Taylor", "Human Resources Manager", 70000);
        Pracownik pracownik7 = new Pracownik("Kevin", "Wilson", "IT Specialist", 60000);
        Pracownik pracownik8 = new Pracownik("Samantha", "Davis", "Customer Service Representative", 40000);

        HashMap<Integer,Pracownik> pracownikHashMap = new HashMap<>();
        MenadzerPracownikow menadzerPracownikow = new MenadzerPracownikow(pracownikHashMap);
        menadzerPracownikow.dodajPracownika(pracownik1.getImie(), pracownik1.getNazwisko(), pracownik1.getPozycja(), pracownik1.getPensja());
        menadzerPracownikow.dodajPracownika(pracownik2.getImie(), pracownik2.getNazwisko(), pracownik2.getPozycja(), pracownik2.getPensja());
        menadzerPracownikow.dodajPracownika(pracownik3.getImie(), pracownik3.getNazwisko(), pracownik3.getPozycja(), pracownik3.getPensja());
        menadzerPracownikow.dodajPracownika(pracownik4.getImie(), pracownik4.getNazwisko(), pracownik4.getPozycja(), pracownik4.getPensja());
        menadzerPracownikow.dodajPracownika(pracownik5.getImie(), pracownik5.getNazwisko(), pracownik5.getPozycja(), pracownik5.getPensja());

        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        while (true)
        {
            System.out.println("1.Dodaj pracownika");
            System.out.println("3.Zaktualizuj dane o pracowniku");
            System.out.println("4.Wyszukaj pracownika po ID");
            System.out.println("5.Wyświetl liste wszystkich pracownikow");
            System.out.println("6.Wyszukaj pracownika po pozycji");
            System.out.println("Inna wartosc zakonczy program");

            int input = scanner1.nextInt();

            switch (input){
                case 1:
                {
                    menadzerPracownikow.dodajPracownika(pracownik7.getImie(), pracownik7.getNazwisko(), pracownik7.getPozycja(), pracownik7.getPensja());
                    break;
                }
                case 3:
                {
                    int id = scanner1.nextInt();
                    Pracownik pracownik = menadzerPracownikow.znajdzPracownikaPrzezId(id);
                    if(pracownik != null){
                        menadzerPracownikow.zaktualizujPracownika(id, "inżynier", 10000);}
                    break;
                }
                case 4:
                {
                    int id = scanner1.nextInt();
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
                    String nazwisko = scanner2.nextLine();
                    HashSet<Pracownik> employeeHashSet = menadzerPracownikow.szukajPracownikowPrzezNazwisko(nazwisko);
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