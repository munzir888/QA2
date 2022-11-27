package AnimationCompany;

public class Animator extends Employee2 {
    private String[] thingsThatCanDraw;

    public Animator(String name, String post, int salary, String[] thingsThatCanDraw) {
        super(name, post, salary);
        this.thingsThatCanDraw = thingsThatCanDraw;
    }

    public String[] getThingsThatCanDraw() {
        return thingsThatCanDraw;
    }

    public void setThingsThatCanDraw(String[] thingsThatCanDraw) {
        this.thingsThatCanDraw = thingsThatCanDraw;
    }
}
