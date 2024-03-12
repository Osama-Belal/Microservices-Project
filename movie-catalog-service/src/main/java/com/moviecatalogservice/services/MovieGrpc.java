package com.moviecatalogservice.services;

import com.example.TrendingMoviesServiceGrpc;
import com.example.getMovieRequest;
import com.example.topTenTrendingMovies;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class MovieGrpc {

    @GrpcClient("trending-movies-service")
    private TrendingMoviesServiceGrpc.TrendingMoviesServiceBlockingStub stub;

    public topTenTrendingMovies getTrending() {
        getMovieRequest request = getMovieRequest.newBuilder().build();
        return stub.getTopTenTrendingMovies(request);
    }
}
