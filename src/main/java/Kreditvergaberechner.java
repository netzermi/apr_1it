import java.util.Scanner;

public class Kreditvergaberechner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaufpreis eingeben:");
        double kaufPreis = scanner.nextDouble();
        System.out.println("Monatliche Rate eingeben:");
        double monatsRate = scanner.nextDouble();
        double minEigenkapital = kaufPreis * 0.2;
        double minEinkommen = monatsRate / 0.4;
        System.out.println("Sie benötigen mindestens "+ minEigenkapital + "Euro Eigenkapital");
        System.out.println("Sie müssen mindestens " + minEinkommen + "Euro pro Monat zur Verfügung haben. ");


    }
}
