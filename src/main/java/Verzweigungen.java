import java.util.Scanner;

public class Verzweigungen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Anzahl der Schrauben:");
        int schrauben = Integer.parseInt(scanner.next());

        System.out.println("Anzahl Muttern:");
        int muttern = Integer.parseInt(scanner.next());

        System.out.println("Anzahl Beilagscheiben:");
        int scheiben = Integer.parseInt(scanner.next());

        double gesamtbetrag = (schrauben * 5d) + (muttern * 3d) + (scheiben * 1d);

        if(schrauben == muttern){
            System.out.println("Bestellung ok.");
        } else{
            System.out.println("Kontrollieren Sie ihre Bestellung");
        }

        System.out.println("Gesamtbetrag EURO: " + gesamtbetrag/100d);





    }
}
