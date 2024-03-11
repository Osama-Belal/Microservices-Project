package com.example.trendingmoviesservice.dao;

import com.example.trendingmoviesservice.models.Rating;

import java.util.List;

public interface RatingsDAO {
    // get list of ratings for a user per userId
    List<Rating> getRatings(String userId);
}
