public class MovieManager {
    int filmsLimit;
    private String[] movies = new String[0];

    public MovieManager(int filmsLimit) {
        this.filmsLimit = filmsLimit;
    }

    public MovieManager() {
        this.filmsLimit = 5;
    }

    public void addMovies(String movie) {
        String[] newArr = new String[movies.length + 1];
        System.arraycopy(movies, 0, newArr, 0, movies.length);
        newArr[newArr.length - 1] = movie;
        this.movies = newArr;
    }
    public String[] showAllFilms() {
        return movies;
    }

    public String[] showLastFilm() {
        int length;
        if (movies.length < filmsLimit) {
            length = movies.length;
        } else {
            length = filmsLimit;
        }

        String[] newArr = new String[length];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = movies[movies.length - 1 - i];
        }

        return newArr;
    }

}
