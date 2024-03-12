package com.moviecatalogservice.services;

import com.example.TrendingMoviesServiceGrpc;
import com.example.getMovieRequest;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class MovieGrpc {

    @GrpcClient("trending-movies-service")
    private TrendingMoviesServiceGrpc.TrendingMoviesServiceBlockingStub stub;

    public String getTrending() {
        stub.getChannel();

        getMovieRequest getMovieRequest = null;
        System.out.println(stub.getTopTenTrendingMovies(getMovieRequest));
        return "Hello World!";
    }
}
