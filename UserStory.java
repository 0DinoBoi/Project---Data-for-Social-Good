import java.util.Scanner;

public class UserStory {
/* 
The private classes that are required to have enough information for our Nike Shoes
*/
private String[] name;
  private int[] listing;
private int[] sales;
  private String[] description;
  private double[] ratings;
  private int[] reviews;

  //This part of the code reads each of the files to get corresponding indexs to print out the information.
  public UserStory (String nameFile, String listingFile, String salesFile, String descriptionFile, String ratingsFile, String reviewsFile){
    name = FileReader.toStringArray(nameFile);
    listing = FileReader.toIntArray(listingFile);
    sales = FileReader.toIntArray(salesFile);
    description = FileReader.toStringArray(descriptionFile);
    ratings = FileReader.toDoubleArray(ratingsFile);
    reviews = FileReader.toIntArray(reviewsFile);
  }

  public String toString(){
    String result = "";
//This is what is going to be printed in the console log.
    for (int i = 0; i < name.length; i++){
      result += "\nName: " + name[i] + "\nListing Price: " + listing[i] + "\nSales Price: " + sales[i] + "\nRating: " + ratings[i]  +"\nReviews Count: " + reviews[i] +"\nDescription - " + description[i] + "\n";
    } // This prints out the name, listing price, sales price, ratings, amount of reviews, and the description
    return result; 
  }
}