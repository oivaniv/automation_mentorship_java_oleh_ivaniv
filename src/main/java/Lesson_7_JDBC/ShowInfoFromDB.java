package Lesson_7_JDBC;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ShowInfoFromDB {
    private final String query = "show tables;";

    public void showInfoFromDB() {
        try {
            Statement statement = SetupConnectionToJDBC.setupConnectionToJDBC().createStatement();
            ResultSet result = statement.executeQuery(TestParameters.customQuery(query));
            ResultSetMetaData resultMetaData = result.getMetaData();

            String columnName = "";

            for (int i = 1; i <= resultMetaData.getColumnCount(); i++) {
                columnName = resultMetaData.getColumnName(i);
                System.out.println(String.format("Column #%d is %s", i, columnName));
            }

            int j = 0;
            while (result.next()) {
                System.out.println(String.format("Table #%d is %s", j, result.getString(columnName)));
                j++;
            }


        } catch (SQLException e) {
            ExceptionHelper.printSQLException(e);
        }
    }
}
