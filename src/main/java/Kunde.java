public class Kunde extends Person{

    public Kunde(String vorname, String nachname) {
        super(vorname, nachname);
    }

    @Override
    public double berechneRabatt() {
        return 0.05;
    }


}
