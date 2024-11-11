import java.util.Scanner;

public class Inhaltsverzeichnis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Überschrift eingeben");
        String header = scanner.next();
        System.out.println("Seitenanzahl eingeben");
        String pages = scanner.next();
        int anzahlZeichen = header.length() + pages.length();
        int anzahlPunkte = 60 - anzahlZeichen;
        System.out.print(header);
        for(int i = 0; i < anzahlPunkte; i++){
            System.out.print(".");
        }
        System.out.print(pages);
    }
}
