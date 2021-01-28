package BasicOOP.Inheritance;

public class ItCompany {
    public int getEmployee() {
        return employee;
    }

    public void setEmployee(int employee) {
        this.employee = employee;
    }

    private int employee;
    double averageRate;
    String headName;

    public void companySound(String companyS){
        System.out.println(companyS);
    }


}
