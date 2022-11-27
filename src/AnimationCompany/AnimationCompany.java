package AnimationCompany;

import ITcompany.Employee.Employee;

public class AnimationCompany {

    private Employee2[] employees2;
    private String nameCompany;
    private double budget;
    private String boss;
    private int outsourcingIncome;
    private  int profitFromAdvertising ;
    private int officeExpenses;
    private int costsForEquipment;
    private int salaryExpenses;
    private int advertisingExpenses ;

    public AnimationCompany(Employee2[] employees2, String nameCompany, double budget, String boss, int outsourcingIncome,
                            int profitFromAdvertising, int officeExpenses, int costsForEquipment, int salaryExpenses,
                            int advertisingExpenses) {
        this.employees2 = employees2;
        this.nameCompany = nameCompany;
        this.budget = budget;
        this.boss = boss;
        this.outsourcingIncome = outsourcingIncome;
        this.profitFromAdvertising = profitFromAdvertising;
        this.officeExpenses = officeExpenses;
        this.costsForEquipment = costsForEquipment;
        this.salaryExpenses = salaryExpenses;
        this.advertisingExpenses = advertisingExpenses;
    }

    public Employee2[] getEmployees2() {
        return employees2;
    }

    public void setEmployees(Employee[] employees) {
        this.employees2 = employees2;
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

    public int getProfitFromAdvertising() {
        return profitFromAdvertising;
    }

    public void setProfitFromAdvertising(int profitFromAdvertising) {
        this.profitFromAdvertising = profitFromAdvertising;
    }

    public int getOfficeExpenses() {
        return officeExpenses;
    }

    public void setOfficeExpenses(int officeExpenses) {
        this.officeExpenses = officeExpenses;
    }

    public int getCostsForEquipment() {
        return costsForEquipment;
    }

    public void setCostsForEquipment(int costsForEquipment) {
        this.costsForEquipment = costsForEquipment;
    }

    public int getSalaryExpenses() {
        return salaryExpenses;
    }

    public void setSalaryExpenses(int salaryExpenses) {
        this.salaryExpenses = salaryExpenses;
    }

    public int getAdvertisingExpenses() {
        return advertisingExpenses;
    }

    public void setAdvertisingExpenses(int advertisingExpenses) {
        this.advertisingExpenses = advertisingExpenses;
    }
}
