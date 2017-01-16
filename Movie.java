package example.codeclan.com.movieproject;

/**
 * Created by user on 16/01/2017.
 */
public class Movie {

    String name;
    String genre;
    int ranking;

    public Movie(String name, String genre, int ranking){
        this.name = name;
        this.genre = genre;
        this.ranking = ranking;
    }

    public String getName() {
        return this.name;
    }


    public String getGenre() {
        return this.genre;
    }

    public int getRating() {
        return this.ranking;
    }

    public void setName(String NewName){
        this.name = NewName;
    }

    public void setGenre(String NewGenre){
        this.genre = NewGenre;
    }

    public void setRanking(int newRanking) {
        this.ranking = newRanking;
    }

    @Override //*ATTENTION
    public String toString() {
        return "Title: " + name + " Genre: " + genre + " Ranking: " + ranking;
    }

    public String getDetails(){
        return toString();//*ATTENTION!
    }
}
