package org.wecancodeit.ReviewSite;

public class Review {

	private String name;
	private String description;
	private Long rating;
	private String image;

	public Review(String name, String description, Long rating, String image) {
		this.name = name;
		this.description = description;
		this.rating = rating;
		this.image = image;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public Long getRating() {
		return rating;
	}

	public String getImage() {
		return image;
	}

}
