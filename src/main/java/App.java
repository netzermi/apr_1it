import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Masse in KG eingeben");
        double masse = Double.valueOf(scanner.next());
        System.out.println("Größe in METER eingeben");
        double groesse = Double.valueOf(scanner.next());
        double bmi = masse / Math.pow(groesse, 2);
        System.out.printf("Dein BMI ist %.2f%n", bmi);

        if(bmi < 18.5){
            System.out.println("Untergewicht");
        } else if (bmi > 18.5 && bmi < 24.9) {
            System.out.println("Normalgewicht");
        } else {
            System.out.println("Übergewicht");
        }





    }
}
