package lesson_10_RestTemplate.ReqresAPI.userRepository;

import lesson_10_RestTemplate.ReqresAPI.dataModels.Employees;

public class EmployeeRepository {
    public static Employees createEmployeeWithId2() {
        Employees employeesWithId2 = new Employees();
        employeesWithId2.setName("morpheus");
        employeesWithId2.setJob("zion resident");
        return employeesWithId2;
    }
}
