package AnimationCompany;

public class Producer extends  Employee2{
     private  String[] animationProducts ;

    public Producer(String name, String post, int salary, String[] animationProducts) {
        super(name, post, salary);
        this.animationProducts = animationProducts;
    }

    public String[] getAnimationProducts() {
        return animationProducts;
    }

    public void setAnimationProducts(String[] animationProducts) {
        this.animationProducts = animationProducts;
    }
}
