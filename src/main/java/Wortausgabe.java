import java.util.Scanner;

public class Wortausgabe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie ein Wort ein");
        String wort = scanner.next();
        int laenge = wort.length();
//        int i = 0;
//        while (i < laenge){
//            System.out.println(wort);
//            i++;
//        }
        for(int i = 0; i < laenge; i++){
            System.out.println(wort);
        }

    }
}
