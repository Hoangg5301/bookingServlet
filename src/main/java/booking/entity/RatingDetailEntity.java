package booking.entity;

public class RatingDetailEntity {
	private String touristAttractionId;
	private String accountId;
	private int rating;
	private String comment;
	
	public String getTouristAttractionId() {
		return touristAttractionId;
	}
	public void setTouristAttractionId(String touristAttractionId) {
		this.touristAttractionId = touristAttractionId;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
}
