package org.wecancodeit.ReviewSite;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;

@RunWith(SpringRunner.class)
@WebMvcTest(ReviewController.class)

public class ReviewControlerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void shouldBeGucciWhenAccessingReviews() throws Exception {
		// Arrange - grab mockMvc
		mockMvc
				// act - do mock request to localhost:8080/Review
				.perform(get("/reviews"))
				// assert
				.andExpect(status().isOk());
	}

	@Test
	public void shouldReturnReviewTemplateWhenAccessingReviews() throws Exception {
		// Arrange
		mockMvc
				// Act
				.perform(get("/reviews"))
				// Assert
				.andExpect(view().name("reviews"));

	}

	@Test
	public void shouldReturnReviewTemplateWhenAccessingReview() throws Exception {
		// Arrange
		mockMvc
				// Act
				.perform(get("/reviews/1"))
				// Assert
				.andExpect(view().name("reviews"));
	}

}
