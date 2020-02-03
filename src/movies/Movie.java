package movies;

public class Movie {
    private String name;
    private String category;

    public Movie(String name, String category) {//constructor for name and category//
        this.name = name;
        this.category = category;
    }

    public String getMovie() {
        return this.name + "--" + this.category;
    }

    public void setMovie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    @Override
    public String toString() {
        return this.name + "-" + this.category;
    }


}