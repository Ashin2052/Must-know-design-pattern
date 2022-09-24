package facade;


public class MySqlHelper {

    public static Connection getMySqlDBConnection(){
        //get MySql DB connection using connection parameters
        return new Connection("MySql");
    }

    public void generateMySqlPDFReport(String tableName, Connection con){
        System.out.println(tableName+" "+ " pdf report generated");
        //get data from table and generate pdf report
    }

    public void generateMySqlHTMLReport(String tableName, Connection con){
        //get data from table and generate pdf report
        System.out.println(tableName+" "+ " html report generated");

    }
}