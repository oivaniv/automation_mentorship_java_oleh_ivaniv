package lesson_7_JDBC;

import java.sql.*;
import java.util.Arrays;

public class WriteDataToJDBC {

    public void insertDataToJDBC(String insertQuery) {
        try {
            PreparedStatement preparedStatement = SetupConnectionToJDBC.setupConnectionToJDBC().prepareStatement(insertQuery);

            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, "Samsung");
            preparedStatement.setString(3, "TV");
            preparedStatement.setInt(4, 1000);

            System.out.println(preparedStatement);

            int result = preparedStatement.executeUpdate();

            System.out.println(result + " rows ");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    //This one doesn't work with using conenction from another class
    public void batchInsertToJDBC() {
        try {
            Statement statement = SetupConnectionToJDBC.setupConnectionToJDBC().createStatement();
            SetupConnectionToJDBC.setupConnectionToJDBC().setAutoCommit(false);

            statement.addBatch("INSERT INTO Devices VALUES (1, 'Samsung', 'TV', 1000);");
            statement.addBatch("INSERT INTO Devices VALUES (2, 'LG', 'Phone', 265);");
            statement.addBatch("INSERT INTO Devices VALUES (3, 'Canon', 'Camera', 403);");
            statement.addBatch("INSERT INTO Devices VALUES (4, 'Samsung', 'Phone', 334);");
            statement.addBatch("INSERT INTO Devices VALUES (5, 'Sony', 'TV', 890);");

            int[] createdCount = statement.executeBatch();

            System.out.println(Arrays.toString(createdCount));

            SetupConnectionToJDBC.setupConnectionToJDBC().commit();

        } catch (
                BatchUpdateException batchUpdateException) {
            ExceptionHelper.printBatchUpdateException(batchUpdateException);
        } catch (
                SQLException e) {
            ExceptionHelper.printSQLException(e);
        }
    }

    public void batchInsertToJDBCWithNewConnection() {

        String url = "jdbc:mysql://localhost:3306/company?useSSL=false";
        String userName = "root";
        String password = "123qwe123";

        try {
            Connection connection = DriverManager.getConnection(url, userName, password);

            Statement statement = connection.createStatement();

            connection.setAutoCommit(false);

            statement.addBatch("INSERT INTO Devices VALUES (1, 'Samsung', 'TV', 1000);");
            statement.addBatch("INSERT INTO Devices VALUES (2, 'LG', 'Phone', 265);");
            statement.addBatch("INSERT INTO Devices VALUES (3, 'Canon', 'Camera', 403);");
            statement.addBatch("INSERT INTO Devices VALUES (4, 'Samsung', 'Phone', 334);");
            statement.addBatch("INSERT INTO Devices VALUES (5, 'Sony', 'TV', 890);");

            int[] createdCount = statement.executeBatch();

            System.out.println(Arrays.toString(createdCount));

            connection.commit();

        } catch (
                BatchUpdateException batchUpdateException) {
            ExceptionHelper.printBatchUpdateException(batchUpdateException);
        } catch (
                SQLException e) {
            ExceptionHelper.printSQLException(e);
        }
    }


}
