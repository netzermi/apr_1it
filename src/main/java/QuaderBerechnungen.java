import java.util.Scanner;

public class QuaderBerechnungen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A eingeben:");
        int a = Integer.parseInt(scanner.next());
        System.out.println("B eingeben:");
        int b = Integer.parseInt(scanner.next());
        System.out.println("C eingeben:");
        int c = Integer.parseInt(scanner.next());
        printAll(a,b,c);

    }

    public static void printAll(double a, double b, double c){
        System.out.println("Volumen: " + volumen(a, b, c));
        System.out.println("Oberfläche: "+ oberflaeche(a, b,c));
        System.out.println("Raumdiagonale: " + raumdiagonale(a, b, c));
    }

    public static double volumen(double a, double b, double c) {
        double volumen = a * b * c;
        return volumen;
    }

    public static double oberflaeche(double a, double b, double c) {
        double oberflaeche = 2 * a * b + 2 * a * c + 2 * b * c;
        return oberflaeche;
    }

    public static double raumdiagonale(double a, double b, double c) {
        double raumdiagonale = Math.sqrt(a * a + b * b + c * c);
        return raumdiagonale;
    }
}