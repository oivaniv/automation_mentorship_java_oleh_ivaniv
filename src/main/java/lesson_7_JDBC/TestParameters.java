package lesson_7_JDBC;

public class TestParameters {

    public static final String createTableQuery = "CREATE TABLE Devices (\r\n" + " Device_ID INT PRIMARY KEY,\r\n" + " Device_name VARCHAR(20),\r\n" + " Device_type VARCHAR(20),\r\n" + " Device_Price INT \r\n" + " );";
    public static final String insertQuery = "INSERT INTO Devices VALUES (?,?,?,?);";

    public static String customQuery(String customQuery) {
        String query = customQuery;
        return query;
    }

    public static String selectQuery(String columns, String table) {
        String query = "SELECT " + columns + " FROM " + table + ";";
        return query;
    }

    public static String selectQuery(String columns, String table, String condition) {
        String query = "SELECT " + columns + " FROM " + table + " WHERE " + condition + ";";
        return query;
    }

    public static String insertQuery(String table, String values) {
        String query = "INSERT INTO " + table + " VALUES (" + values + ");";
        return query;
    }

    public static String dropQuery(String table) {
        String query = "DROP TABLE " + table;
        return query;
    }


}
