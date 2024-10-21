public class SQLDB implements Database {
    @Override
    public void write() {
        System.out.println("Write row");
    }

    @Override
    public void read() {
        System.out.println("Read row");
    }
}
