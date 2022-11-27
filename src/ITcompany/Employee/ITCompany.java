package ITcompany.Employee;

public class ITCompany {

    private Employee[] employees;
    private String nameCompany;
    private double budget;
    private String boss;

    private int outsourcingIncome;
    private int outstaffingIncome;
    private int officeExpenses ;
    private  int costsForEquipment ;
    private  int salaryExpenses ;

    public ITCompany(Employee[] employees, String nameCompany, double budget, String boss,
                     int outsourcingIncome, int outstaffingIncome, int officeExpenses, int costsForEquipment,
                     int salaryExpenses) {
        this.employees = employees;
        this.nameCompany = nameCompany;
        this.budget = budget;
        this.boss = boss;
        this.outsourcingIncome = outsourcingIncome;
        this.outstaffingIncome = outstaffingIncome;
        this.officeExpenses = officeExpenses;
        this.costsForEquipment = costsForEquipment;
        this.salaryExpenses = salaryExpenses;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public String getBoss() {
        return boss;
    }

    public void setBoss(String boss) {
        this.boss = boss;
    }



    public int getOutsourcingIncome() {
        return outsourcingIncome;
    }

    public void setOutsourcingIncome(int outsourcingIncome) {
        this.outsourcingIncome = outsourcingIncome;
    }

    public int getOutstaffingIncome() {
        return outstaffingIncome;
    }

    public void setOutstaffingIncome(int outstaffingIncome) {
        this.outstaffingIncome = outstaffingIncome;
    }
}
