public class App2 {
    public static void main(String[] args) {
        int a = 158;
        int b = 20;

        int wynik = a % b;

        System.out.println(wynik);

        String imie = "Mateusz";
        String nazwisko = "Bereda";

        String suma = imie + " " + nazwisko;

        System.out.println(suma);

        boolean wynikLogiczny = a < b;

        System.out.println(wynikLogiczny);

        boolean b1 = true;
        boolean b2 = true;

        System.out.println(b1 || b2);
        System.out.println(!b2);

        System.out.println(b1 ^ b2);
    }
}
