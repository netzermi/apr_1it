public class MitarbeiterService {
    Database db;

    public MitarbeiterService() {
        this.db = new NoSQLDB();
    }

    public MitarbeiterService(Database db) {
        this.db = db;
    }


}
