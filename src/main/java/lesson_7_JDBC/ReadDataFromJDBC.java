package lesson_7_JDBC;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ReadDataFromJDBC {
    SetupConnectionToJDBC setupConnectionToJDBC = new SetupConnectionToJDBC();

    public void selectAllFromUsers() {

        try {
            Statement statement = setupConnectionToJDBC.setupConnectionToJDBC().createStatement();
            ResultSet result = statement.executeQuery(TestParameters.selectQuery("*","Users"));

            List<Users> usersFromDB = new ArrayList<>();
            while (result.next()) {
                Users users = new Users();
                users.setId(result.getInt("User_ID"));
                users.setName(result.getString("User_Name"));
                users.setSurname(result.getString("User_Surname"));
                users.setBirth_year(result.getInt("Birth_Date"));
                usersFromDB.add(users);
            }
            System.out.println(usersFromDB.get(0).getId()+" "+usersFromDB.get(0).getName()+" "+usersFromDB.get(0).getSurname()+" "+usersFromDB.get(0).getBirth_year());

        } catch (SQLException e) {
            ExceptionHelper.printSQLException(e);
        }
    }

    public void selectByIdFromUsers(int id) {

        try {
            Statement statement = setupConnectionToJDBC.setupConnectionToJDBC().createStatement();
            ResultSet result = statement.executeQuery(TestParameters.selectQuery("*", "Users", "User_ID="+id));

            List<Users> usersFromDB = new ArrayList<>();
            while (result.next()) {
                Users users = new Users();
                users.setId(result.getInt("User_ID"));
                users.setName(result.getString("User_Name"));
                users.setSurname(result.getString("User_Surname"));
                users.setBirth_year(result.getInt("Birth_Date"));
                usersFromDB.add(users);
            }
            System.out.println(usersFromDB.get(0).getId()+" "+usersFromDB.get(0).getName()+" "+usersFromDB.get(0).getSurname()+" "+usersFromDB.get(0).getBirth_year());

        } catch (SQLException e) {
            ExceptionHelper.printSQLException(e);
        }
    }
}
