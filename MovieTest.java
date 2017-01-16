package example.codeclan.com.movieproject;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by user on 16/01/2017.
 */
public class MovieTest {

    Movie movie;

    @Before
    public void before(){
        movie = new Movie("Gone With The Wind", "romance", 1);
    }

    @Test
    public void canGetName(){
        assertEquals("Gone With The Wind", movie.getName());
    }

    @Test
    public void canGetGenre(){
        assertEquals("romance", movie.getGenre());
    }

    @Test
    public void canGetRating(){
        assertEquals(1, movie.getRating());
    }

    @Test
    public void canSetName(){
        movie.setName("Vertigo");
        assertEquals("Vertigo", movie.getName());
    }

    @Test
    public void canSetGenre(){
        movie.setGenre("horror");
        assertEquals("horror", movie.getGenre());
    }

    @Test
    public void canSetRanking(){
        movie.setRanking(2);
        assertEquals(2, movie.getRating());
    }

    @Test
    public void canGetDetails(){
        String content = movie.getDetails();
        System.out.println(content);
        assertNotNull(content); //there is SOME content out there, that's what we're checking
    }
}
