import java.util.Scanner;

public class Rechner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zahl 1 eingeben");
        int zahl1 = Integer.valueOf(scanner.next());

        System.out.println("Zahl 2 eingeben");
        int zahl2 = Integer.valueOf(scanner.next());

        int summe = zahl1 + zahl2;
        System.out.println("Die Summe ist " + summe);

    }
}
