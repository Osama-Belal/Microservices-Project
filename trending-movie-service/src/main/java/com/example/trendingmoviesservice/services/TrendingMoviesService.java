package com.example.trendingmoviesservice.services;

import com.example.Movie;
import com.example.TrendingMoviesServiceGrpc;
import com.example.getMovieRequest;
import com.example.topTenTrendingMovies;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;


@GrpcService
public class TrendingMoviesService extends TrendingMoviesServiceGrpc.TrendingMoviesServiceImplBase {

    @Override
    public void getTopTenTrendingMovies(getMovieRequest request, StreamObserver<topTenTrendingMovies> responseObserver) {
        Movie movie = Movie.newBuilder()
                .setMovieId("1")
                .build();

        topTenTrendingMovies response = topTenTrendingMovies.newBuilder()
                .addMovies(movie)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
