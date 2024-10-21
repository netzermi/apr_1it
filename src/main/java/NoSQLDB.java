public class NoSQLDB implements Database {


    @Override
    public void write() {
        System.out.println("Writing JSON");
    }

    @Override
    public void read() {
        System.out.println("Reading JSON");
    }
}
