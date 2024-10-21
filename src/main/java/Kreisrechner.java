import java.util.Scanner;

public class Kreisrechner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Radius eingeben:");
        double radius = scanner.nextDouble();

       // double flaeche = radius * radius * 3.1415;
       // double flaeche2 = radius * radius * Math.PI;
        double flaeche = Math.pow(radius, 2d) * Math.PI;
        System.out.println("Die Fläche des Kreises mit dem Raidus " + radius + " ist: " + flaeche);
        System.out.printf("Die Fläche des Kreises mit dem Radius %.2f ist: %.2f", radius, flaeche);


    }
}
