package facade;

public class OracleHelper {


    public static Connection getOracleDBConnection(){
        //get Oracle DB connection using connection parameters
        return new Connection("Oracle");
    }

    public void generateOraclePDFReport(String tableName, Connection con){
        System.out.println(tableName+" "+ " pdf report generated");
        //get data from table and generate pdf report
    }

    public void generateOracleHTMLReport(String tableName, Connection con){
        //get data from table and generate pdf report
        System.out.println(tableName+" "+ " html report generated");

    }
}