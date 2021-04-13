package lesson_7_JDBC;

import java.sql.BatchUpdateException;
import java.sql.SQLException;

public class ExceptionHelper {
    public static void printSQLException(SQLException exception) {
        for (Throwable e : exception) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = exception.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }

    public static void printBatchUpdateException(BatchUpdateException batchUpdateException) {
        System.err.println("--------BatchUpdateException--------");
        System.err.println("SQLState: " +batchUpdateException.getSQLState());
        System.err.println("Message: " +batchUpdateException.getMessage());
        System.err.println("Vendor: " +batchUpdateException.getErrorCode());
        System.err.print("Update counts: ");
        int[] updateCounts = batchUpdateException.getUpdateCounts();

        for (int i =0;i<updateCounts.length;i++){
            System.err.print(updateCounts[i] + " ");
        }

    }


}
