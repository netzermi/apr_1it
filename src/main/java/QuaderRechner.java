import java.util.Scanner;

public class QuaderRechner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Länge A eingeben:");
        double a = scanner.nextDouble();

        System.out.println("Länge B eingeben:");
        double b = scanner.nextDouble();

        System.out.println("Länge C eingeben:");
        double c = scanner.nextDouble();

        double summeKantenlaenge = (a + b + c) * 4.0;
        double oberflaeche = (a*b*2) + (a*c*2) + (b*c*2);
        double volumen = a*b*c;

        System.out.println("Summe KL: " + (a + b + c) * 4.0);
        System.out.println("Oberfläche " + oberflaeche);
        System.out.println("Volumen: " + volumen);






    }

}
