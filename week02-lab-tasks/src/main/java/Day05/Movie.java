package Day05;

import java.util.List;
import java.util.ArrayList;

public class Movie {

    private String title;
    private int yearOfProduction;
    private double avgRating;
  //  private int sumOfRatings;
   // private int sumOfVoters;
    private List<Integer> ratings = new ArrayList<>();

    public Movie(String title, int yearOfProduction) {
        this.title = title;
        this.yearOfProduction = yearOfProduction;
    }

    public double rateMovie(int rating) {
        ratings.add(rating);
        avgRating=calculateAvg();
        return avgRating;
    }

    private double calculateAvg() {
        double sum = 0;
        for (int i = 0; i < ratings.size(); i++) {
            sum += ratings.get(i);
        }
        return sum;
    }

    /*  public double rateMovie(int rating) {
          sumOfRatings += rating;
          sumOfVoters++;
          avgRating=(double)sumOfRatings/sumOfVoters;
          return avgRating;
      }
  */
    public String getTitle() {
        return title;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public double getAvgRating() {
        return avgRating;
    }

  /*  public int getSumOfRatings() {
        return sumOfRatings;
    }

    public int getSumOfVoters() {
        return sumOfVoters;
    }

   */
}
