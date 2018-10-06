package org.wecancodeit.ReviewSite;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;

public class ReviewRepositoryTest {

	private ReviewRepository reviewRepo = new ReviewRepository();

	@Test
	public void shouldAcceptReviews() {
		// Arrange
		Review malibu = new Review("Malibu", "A cool sporty boat great for watersports!", 10L, "");
		// act
		int repoSizeBeforeAddding = reviewRepo.size();
		reviewRepo.add(malibu);
		int repoSizeAfterAdding = reviewRepo.size();
		// Assert
		assertThat(repoSizeAfterAdding, is(equalTo(repoSizeBeforeAddding + 1)));

	}

	@Test
	public void shouldReturnOneReview() {
		// Arrange
		Review pontoon = new Review("Pontoon", "Perfect for kids or cracking open a cold one with the bois", 8L, "");

		reviewRepo.add(pontoon);
		Review result = reviewRepo.findOne(8L);
		assertThat(result, is(pontoon));

	}

}
