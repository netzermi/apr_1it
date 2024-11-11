import java.util.Scanner;

public class PVRechner {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("KWh Peakleistung eingeben, Minus zahl zum Beenden");
            double kwhp = Double.parseDouble(scanner.next());
            if(kwhp < 0 ){
                break;
            }
            double foerderung = kwhp * 80d;
            System.out.println("Förderung: " + foerderung);
        }



    }
}
