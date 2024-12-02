import java.util.Scanner;

public class Ratenzahlung {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie den monatlichen Betrag ein:");
        double rueckzahlung = Double.parseDouble(scanner.next());
        double saldo = 1000d;
        double gesamtzahlung = 0;
        int monat = 1;
        while(saldo > 0d){
            saldo = saldo*1.015;
            saldo = saldo - rueckzahlung;
            gesamtzahlung = gesamtzahlung + rueckzahlung;
            System.out.println("Monat: " + monat + " Saldo: " + saldo + " Gesamtbetrag: " + gesamtzahlung);
            monat++;
            //monat = monat + 1;
        }

    }
}
