package org.wecancodeit.ReviewSite;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	private Map<Long, Review> reviews = new HashMap<>();

	public ReviewRepository() {
		add(new Review("Malibu", "A cool sporty boat great for watersports!", 9L));
		add(new Review("Aqua Patio", "A cool sporty boat great for watersports!", 7L));
		add(new Review("Crestliner Kodiak",
				"A great fishing boat that can give you fishing needs as well as power, super affordable too!!", 8L));

	}

	public void add(Review review) {
		reviews.put(review.getRating(), review);

	}

	public Collection<Review> findAll() {

		return reviews.values();
	}

	public Review findOne(Long rating) {

		return reviews.get(rating);
	}

	public int size() {

		return reviews.size();
	}

}
