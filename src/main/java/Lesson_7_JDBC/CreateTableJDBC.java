package Lesson_7_JDBC;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableJDBC {

    public void createTableJDBC(String createQuery) {
        try {
            Statement statement = SetupConnectionToJDBC.setupConnectionToJDBC().createStatement();
            int result = statement.executeUpdate(createQuery);

            System.out.println(createQuery);
            if (result == 0) {
                System.out.println("New table is created");
            }
            SetupConnectionToJDBC.setupConnectionToJDBC().close();

        } catch (SQLException e) {
            ExceptionHelper.printSQLException(e);
        }
    }

    public void deleteTableJDBC(String tableName) {
        try {
            Statement statement = SetupConnectionToJDBC.setupConnectionToJDBC().createStatement();
            int result = statement.executeUpdate(TestParameters.dropQuery(tableName));

            System.out.println(TestParameters.dropQuery(tableName));
            if (result == 0) {
                System.out.println(tableName + " --- table is deleted");
            }

        } catch (SQLException e) {
            ExceptionHelper.printSQLException(e);
        }
    }


}
