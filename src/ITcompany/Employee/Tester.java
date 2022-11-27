package ITcompany.Employee;

public class Tester extends Employee {
    private String programmingLanguageForTests ;

    public Tester(String name, String post, int salary, String programmingLanguageForTests) {
        super(name, post, salary);
        this.programmingLanguageForTests = programmingLanguageForTests;
    }

    public String getProgrammingLanguageForTests() {
        return programmingLanguageForTests;
    }

    public void setProgrammingLanguageForTests(String programmingLanguageForTests) {
        this.programmingLanguageForTests = programmingLanguageForTests;
    }
}
