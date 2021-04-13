package lesson_7_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SetupConnectionToJDBC {

   public static Connection setupConnectionToJDBC(){
        String url = "jdbc:mysql://localhost:3306/company?useSSL=false";
        String userName = "root";
        String password = "123qwe123";
        Connection connection = null;
        {
            try {
                connection = DriverManager.getConnection(url, userName, password);
            } catch (SQLException e) {
                ExceptionHelper.printSQLException(e);
            }
        }
        return connection;
    }

    public  void closeConnectionToJDBC() throws SQLException {
        setupConnectionToJDBC().close();
    }

}
