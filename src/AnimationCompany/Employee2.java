package AnimationCompany;

public  abstract  class Employee2 {
    private String name ;
    private  String post ;
    private  int salary ;

    public Employee2(String name, String post, int salary) {
        this.name = name;
        this.post = post;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
