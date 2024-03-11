package com.example.trendingmoviesservice.resources;

import com.example.trendingmoviesservice.models.Rating;
import com.example.trendingmoviesservice.models.UserRating;
import com.example.trendingmoviesservice.services.RatingService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingsResource {

    private final RatingService ratingService;
    public RatingsResource(RatingService ratingService) {
        this.ratingService = ratingService;
    }

    @RequestMapping("/{userId}")
    public UserRating getRatingsOfUser(@PathVariable String userId) {
        List<Rating> ratings = ratingService.getMoviesRatingByUser(userId);
        return new UserRating(ratings);
    }
}
