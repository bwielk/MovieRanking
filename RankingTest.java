package example.codeclan.com.movieproject;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
/**
 * Created by user on 16/01/2017.
 */
public class RankingTest {

    Ranking ranking;
    Movie movie1;
    Movie movie2;
    Movie movie3;
    Movie newMovie3;

    @Before
    public void before(){
        ranking = new Ranking();
        movie3 = new Movie("The Birds", "horror", 3);
        movie2 = new Movie("Still Alice", "drama", 2);
        movie1 = new Movie("The Hours", "drama", 1);
        newMovie3 = new Movie("Pret-a-porter", "drama", 3);
    }

    @Test
    public void canAddMovieToTheRanking(){
        ranking.addMovie(movie1);
        ranking.addMovie(movie2);
        ranking.addMovie(movie3);
        assertEquals(3, ranking.movieCount());
    }

    @Test
    public void canGetMovie(){
        ranking.addMovie(movie1);
        ranking.addMovie(movie2);
        ranking.addMovie(movie3);
        Movie film = ranking.getMovie(1);
        String details = film.getDetails();
        assertNotNull(details);
    }

    @Test
    public void canRemoveLastMovie(){
        ranking.addMovie(movie1);
        ranking.addMovie(movie2);
        ranking.addMovie(movie3);
        ranking.deleteLast();
        assertEquals(2, ranking.movieCount());
    }

    @Test
    public void canReplaceLastMovie(){
        ranking.addMovie(movie1);
        ranking.addMovie(movie2);
        ranking.addMovie(movie3);
        ranking.replaceLast(newMovie3);
        Movie assertion = ranking.getLast();
        assertEquals("Pret-a-porter", assertion.getName());
    }
}
