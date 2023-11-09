import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {
    @Test
    public void NoAddMovieTest() {
        MovieManager manager = new MovieManager();
        String[] actual = manager.showAllFilms();
        String[] expected = {};
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void AddMovieTest1() {
        // add 1 film

        MovieManager manager = new MovieManager();
        manager.addMovies("F1");

        String[] actual = manager.showAllFilms();
        String[] expected = {"F1"};
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void AddMovieTest2() {
        // add 5 films

        MovieManager manager = new MovieManager();
        manager.addMovies("F1");
        manager.addMovies("F2");
        manager.addMovies("F3");
        manager.addMovies("F4");
        manager.addMovies("F5");

        String[] actual = manager.showAllFilms();
        String[] expected = {"F1", "F2", "F3", "F4", "F5"};
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void showTest1() {
        // add 5 films

        MovieManager manager = new MovieManager();
        manager.addMovies("F1");
        manager.addMovies("F2");
        manager.addMovies("F3");
        manager.addMovies("F4");
        manager.addMovies("F5");

        String[] actual = manager.showLastFilm();
        String[] expected = {"F5", "F4", "F3", "F2", "F1"};
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void showTest2() {
        // add 1 films

        MovieManager manager = new MovieManager();
        manager.addMovies("F1");

        String[] actual = manager.showLastFilm();
        String[] expected = {"F1"};
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void showTest3() {
        // add 5 films, films limit 3

        MovieManager manager = new MovieManager(3);
        manager.addMovies("F1");
        manager.addMovies("F2");
        manager.addMovies("F3");
        manager.addMovies("F4");
        manager.addMovies("F5");

        String[] actual = manager.showLastFilm();
        String[] expected = {"F5", "F4", "F3"};
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void showTest4() {
        // add 5 films, films limit 7

        MovieManager manager = new MovieManager(7);
        manager.addMovies("F1");
        manager.addMovies("F2");
        manager.addMovies("F3");
        manager.addMovies("F4");
        manager.addMovies("F5");

        String[] actual = manager.showLastFilm();
        String[] expected = {"F5", "F4", "F3", "F2", "F1"};
        Assertions.assertArrayEquals(actual, expected);
    }


}
