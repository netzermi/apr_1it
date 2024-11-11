import java.util.Scanner;

public class Ratenzahlung {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie den monatlichen Betrag ein:");
        double rueckzahlung = Double.parseDouble(scanner.next());
        double saldo = 1000d;
        double gesamtzahlung = 0;
        while(saldo > 0d){
            saldo = saldo*1.015;
            saldo = saldo - rueckzahlung;
            gesamtzahlung = gesamtzahlung + rueckzahlung;
            System.out.println("Saldo: " + saldo + " Gesamtbetrag: " + gesamtzahlung);
        }

    }
}
