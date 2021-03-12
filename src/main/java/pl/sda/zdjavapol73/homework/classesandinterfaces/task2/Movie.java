package pl.sda.zdjavapol73.homework.classesandinterfaces.task2;

public class Movie {
    private String title;
    private String director;
    private int yearOfProduction;
    private String category;
    private String publisher;

    private Movie(String title, String director, int yearOfProduction, String category, String publisher) {
        this.title = title;
        this.director = director;
        this.yearOfProduction = yearOfProduction;
        this.category = category;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", category='" + category + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }

    public static class MovieCreator{
        private String title;
        private String director;
        private int yearOfProduction;
        private String category;
        private String publisher;

        public MovieCreator setTitle(String title) {
            this.title = title;
            return this;
        }

        public MovieCreator setDirector(String director) {
            this.director = director;
            return this;
        }

        public MovieCreator setYearOfProduction(int yearOfProduction) {
            this.yearOfProduction = yearOfProduction;
            return this;
        }

        public MovieCreator setCategory(String category) {
            this.category = category;
            return this;
        }

        public MovieCreator setPublisher(String publisher) {
            this.publisher = publisher;
            return this;
        }

        public Movie createMovie() {
            Movie movie = new Movie(title, director, yearOfProduction,category, publisher);
            return movie;
        }
    }
}
