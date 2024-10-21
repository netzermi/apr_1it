public class Mitarbeiter extends Person{

    public Mitarbeiter(String vorname, String nachname) {
        super(vorname, nachname);
    }


    @Override
    public double berechneRabatt() {
        return 0.1;
    }
}
