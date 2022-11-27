package AnimationCompany;

public class Screenwriter extends  Employee2 {
    private  String[] genres ;

    public Screenwriter(String name, String post, int salary, String[] genres) {
        super(name, post, salary);
        this.genres = genres;
    }

    public String[] getGenres() {
        return genres;
    }

    public void setGenres(String[] genres) {
        this.genres = genres;
    }
}
