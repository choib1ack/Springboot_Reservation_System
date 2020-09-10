package kr.co.fascampus.eatgo.interfeaces;

import kr.co.fascampus.eatgo.application.ReviewService;
import kr.co.fascampus.eatgo.domain.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping("/restaurants/{restaurantsId}/reviews")
    public ResponseEntity<?> create() throws URISyntaxException {
        Review review = Review.builder().build();
        reviewService.addReview(review);

        return ResponseEntity.created(new URI("/restaurants/1/reviews1")).body("{}");
    }
}