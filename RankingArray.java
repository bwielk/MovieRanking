package example.codeclan.com.movieproject;

/**
 * Created by user on 17/01/2017.
 */
public class RankingArray {

    private Movie[] ranking;

    public RankingArray(){

        this.ranking = new Movie[10];
    }

    public int movieCount() {
        int counter = 0;
        for(Movie movie : ranking){
            if(movie != null){
                counter++;
            }
        }
        return counter;
    }

    public boolean isFull(){
        return movieCount() == ranking.length;
    }

    public void addMovie(Movie movie){
        if(isFull()) return;
        int index = movieCount();
        ranking[index] = movie;
    }

    public void addMovieByItsRank(Movie movie){
        if(isFull()) return;
            int index = movie.getRating() - 1;
            ranking[index] = movie;
    }

    public int maxSize(){
        int counter = 0;
        for(int i =0; i < ranking.length; i++){
            counter++;
        }
        return counter;
    }

    public Movie getMovieByItsRanking(int i){
        return ranking[i-1];
    }
    public void replaceLastMovie(Movie movie){
        int index = maxSize() -1; //10 elements/ index nums range from 0-9
        ranking[index] = movie;
    }

    public void replaceMovie(Movie movie){
        int index = movie.getRating() -1;
        ranking[index] = movie;
    }
}
