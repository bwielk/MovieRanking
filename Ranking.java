package example.codeclan.com.movieproject;
import java.util.ArrayList;

/**
 * Created by user on 16/01/2017.
 */
public class Ranking {

    ArrayList<Movie> ranking;

    public Ranking(){
        ranking = new ArrayList<Movie>();
    }

    public void addMovie(Movie movie){
        int index = movie.getRating();
        ranking.add(index - 1, movie);
    }

    public Movie getMovie(int rating){
        return ranking.get(rating - 1);
    }

    public int movieCount(){
        return ranking.size();
    }

    public Movie getLast(){
        return ranking.get(ranking.size() -1);
    }

    public void deleteLast(){
       ranking.remove(ranking.size() -1);
    }

    public void replaceLast(Movie movie){
        if(movie.getRating() == ranking.size()){
            deleteLast();
            addMovie(movie);
        }else{
            System.out.println("You cannot add the movie with this ranking!");
        }
    }

}
