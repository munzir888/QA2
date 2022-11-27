package ITcompany.Employee;

public class Developer extends Employee {
    private  String[] technologyStacks ;

    public Developer(String name, String post, int salary, String[] technologyStacks) {
        super(name, post, salary);
        this.technologyStacks = technologyStacks;
    }

    public String[] getTechnologyStacks() {
        return technologyStacks;
    }

    public void setTechnologyStacks(String[] technologyStacks) {
        this.technologyStacks = technologyStacks;
    }
}
