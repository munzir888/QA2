package ITcompany.Employee;

public class Manager extends Employee {
    private String[] projects;

    public Manager(String name, String post, int salary, String[] projects) {
        super(name, post, salary);
        this.projects = projects;
    }

    public String[] getProjects() {
        return projects;
    }

    public void setProjects(String[] projects) {
        this.projects = projects;
    }


}
