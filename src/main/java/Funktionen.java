public class Funktionen {
    public static void main(String[] args) {
        System.out.println(berechneBMI(1.80, 80));
        System.out.println(berechneBMI(2d, 80));
    }


    /**
     * Berechnet den BMI Wert
     * @param groesse Größe in cm
     * @param gewicht Gewicht in kg
     * @return BMI Wert
     */
    public static double berechneBMI(double groesse, double gewicht){
        double bmi = gewicht / Math.pow(groesse, 2);
        return bmi;
    }









}
