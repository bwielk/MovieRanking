package example.codeclan.com.movieproject;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 17/01/2017.
 */
public class RankingArrayTest {

    RankingArray ranking;
    Movie movie10;
    Movie movie2;
    Movie movie3;
    Movie newMovie3;
    Movie movie4;
    Movie newMovie4;
    Movie newMovie10;

    @Before
    public void before(){
        ranking = new RankingArray();
        movie4 = new Movie("Amy", "documentary", 4);
        movie3 = new Movie("The Birds", "horror", 3);
        movie2 = new Movie("Still Alice", "drama", 2);
        movie10 = new Movie("The Hours", "drama", 10);
        /////////////////////////////////////////////////////////////////////////////////
        newMovie3 = new Movie("Pret-a-porter", "drama", 3);
        newMovie4 = new Movie("The Editor's Eye", "documentary", 4);
        newMovie10 = new Movie("Kramer vs Kramer", "drama", 10);
    }

    @Test
    public void RankingCanBeFull(){
        for(int i=0; i<ranking.maxSize(); i++) {
            ranking.addMovie(movie10);
        }
        assertEquals(true, ranking.isFull());
    }

    @Test
    public void canAddMovie() {
        ranking.addMovie(movie10);
        ranking.addMovie(movie2);
        assertEquals(2, ranking.movieCount());
    }

    @Test
    public void canAddMovieAtRankingValue(){
        ranking.addMovieByItsRank(movie10);
        ranking.addMovieByItsRank(movie2);
        Movie instance = ranking.getMovieByItsRanking(10);
        assertEquals("The Hours", instance.getName());
    }

    @Test
    public void canReplaceLastMovie(){
        ranking.addMovieByItsRank(movie10);
        ranking.addMovieByItsRank(movie2);
        ranking.replaceLastMovie(newMovie10);
        Movie instance = ranking.getMovieByItsRanking(10);
        assertEquals("Kramer vs Kramer", instance.getName());
    }

    @Test
    public void canOverrideAnyMovie(){
        ranking.addMovieByItsRank(movie10);
        ranking.addMovieByItsRank(movie2);
        ranking.addMovieByItsRank(movie3);
        ranking.addMovieByItsRank(movie4);
        ranking.replaceMovie(newMovie3);
        Movie instance = ranking.getMovieByItsRanking(3);
        assertEquals("Pret-a-porter", instance.getName());
    }


}
