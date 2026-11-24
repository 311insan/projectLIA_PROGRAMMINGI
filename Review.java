
/**
 * Write a description of class Reviews here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Review
{
    private String reviewerName;
    private int rating;
    private String review;

    /**
     * Constructor for objects of class Reviews
     */
    public Review(String reviewerName, int rating10)
    {
        this.reviewerName = reviewerName;
        rating = rating10;
    }
    
    public void addReview(String review){
        this.review = review;
    }
    
}