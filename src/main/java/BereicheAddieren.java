import java.util.Scanner;

public class BereicheAddieren {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unterenze:");
        int untergrenze = Integer.parseInt(scanner.next());
        System.out.println("Obergrenze");
        int obergrenze = Integer.parseInt(scanner.next());
        int summeInnerhalb = 0;
        int summeAusserhalb = 0;

        while(true){
            System.out.println("Daten eingeben:");
            int x = Integer.parseInt(scanner.next());
            if(x==0){
                break;
            }
            if(x >= untergrenze && x <= obergrenze){
                summeInnerhalb = summeInnerhalb + x;
                summeInnerhalb += x;
            } else {
                summeAusserhalb = summeAusserhalb + x;
                // summeAusserhalb += x;
            }

        }
        System.out.println("Summe innerhalb: " + summeInnerhalb);
        System.out.println("Summe außerhalb: " + summeAusserhalb);
    }
}
