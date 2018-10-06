package org.wecancodeit.ReviewSite;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ReviewController {

	@Resource

	private ReviewRepository reviewRepo = new ReviewRepository();

	@GetMapping("/reviews")
	public String getReviews(Model model) {

		model.addAttribute("reviews", reviewRepo.findAll());
		return "reviews";
	}

	@GetMapping("/reviews/{rating}")
	public String getReview(@PathVariable(value = "rating") Long rating, Model model) {
		System.out.println(reviewRepo.findOne(rating));
		model.addAttribute("review", reviewRepo.findOne(rating));

		return "review";
	}

}
