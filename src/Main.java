import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

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

    }
}