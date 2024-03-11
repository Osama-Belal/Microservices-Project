package com.example.movieinfoservice.resources;

import com.example.movieinfoservice.models.Movie;
import com.example.movieinfoservice.models.MovieSummary;
import com.example.movieinfoservice.repositories.MovieCacheRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/movies")
public class MovieResource {

    @Value("${api.key}")
    private String apiKey;

    private final MovieCacheRepository movieRepository;
    private final RestTemplate restTemplate;

    public MovieResource(RestTemplate restTemplate, MovieCacheRepository movieRepository) {
        this.restTemplate = restTemplate;
        this.movieRepository = movieRepository;
    }

    @RequestMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") String movieId) {
        // Check if the movie is already in the cache
        if (movieRepository.findById(movieId).isPresent()) {
            System.out.println("Fetching from cache...");
            return movieRepository.findById(movieId).get();
        }

        // Get the movie info from TMDB
        final String url = "https://api.themoviedb.org/3/movie/" + movieId + "?api_key=" + apiKey;
        MovieSummary movieSummary = restTemplate.getForObject(url, MovieSummary.class);

        // Save the movie in the cache
        Movie movie = new Movie(movieId, movieSummary.getTitle(), movieSummary.getOverview());
        movieRepository.save(movie);
        return movie;
    }
}
