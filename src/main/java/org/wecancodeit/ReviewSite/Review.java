package org.wecancodeit.ReviewSite;

public class Review {

	private String name;
	private String description;
	private Long rating;

	public Review(String name, String description, Long rating) {
		this.name = name;
		this.description = description;
		this.rating = rating;
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

}
