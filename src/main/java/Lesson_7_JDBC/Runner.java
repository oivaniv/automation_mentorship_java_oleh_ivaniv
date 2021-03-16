package Lesson_7_JDBC;

import java.sql.SQLException;

public class Runner {
    public static void main(String[] args) throws SQLException {
        ReadDataFromJDBC connectionToJDBC = new ReadDataFromJDBC();
        WriteDataToJDBC writeDataToJDBC = new WriteDataToJDBC();
        CreateTableJDBC createTableJDBC = new CreateTableJDBC();

//        connectionToJDBC.selectAllFromUsers();
//        System.out.println();
//        connectionToJDBC.selectByIdFromUsers(3);
//
        createTableJDBC.createTableJDBC(TestParameters.createTableQuery);
        System.out.println();
//
//        writeDataToJDBC.insertDataToJDBC(TestParameters.insertQuery);
//        System.out.println();
//
//        createTableJDBC.deleteTableJDBC("devices");

        writeDataToJDBC.batchInsertToJDBC();


    }
}
