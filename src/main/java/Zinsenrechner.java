import java.sql.SQLOutput;
import java.util.Scanner;

public class Zinsenrechner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Startkapital:");
        double startkapital = scanner.nextDouble();
        System.out.println("Zinssatz in Prozent:");
        double zinsen= scanner.nextDouble()/100d;
        double aktuellesKapital=startkapital;
        for(int i = 1; i < 2024; i++){
            aktuellesKapital = aktuellesKapital*(1+zinsen);
            System.out.println("Jahr " + i + " Euro: " + aktuellesKapital);
        }

    }
}
