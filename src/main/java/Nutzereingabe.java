import java.util.Scanner;

public class Nutzereingabe {

    public static void main(String[] args) {
        System.out.println("Wie heißt du?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hallo " + name.toUpperCase());
    }
}
