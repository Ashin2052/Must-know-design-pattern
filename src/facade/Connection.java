package facade;

public class Connection {
    private String connection;

    Connection (String dbTYpe) {
         connection = dbTYpe +"-"+ "connected";
    }

    public String getConnection() {
        return connection;
    }
}
