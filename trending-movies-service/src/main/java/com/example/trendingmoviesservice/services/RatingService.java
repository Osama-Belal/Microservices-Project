package com.example.trendingmoviesservice.services;

import com.example.trendingmoviesservice.dao.RatingsDAO;
import com.example.trendingmoviesservice.models.Rating;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingService {

    private final RatingsDAO ratingsDataAccess;

    public RatingService(RatingsDAO ratingsDataAccess) {
        this.ratingsDataAccess = ratingsDataAccess;
    }

    public List<Rating> getMoviesRatingByUser(String userId) {
        return ratingsDataAccess.getRatings(userId);
    }
}
