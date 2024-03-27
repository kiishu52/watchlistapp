package com.example.watchlist.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.watchlist.Repository.MovieRepo;
import com.example.watchlist.entity.Movie;

 @Service
public class DatabaseService {
	 
   @Autowired
	MovieRepo movieRepo;
public void  create(Movie movie) {
      movieRepo.save(movie);

}	
 public List<Movie> getAllMovie(){
	 return movieRepo.findAll();
 }

public Movie getmoviebyid(Integer id) {
	// TODO Auto-generated method stub
return movieRepo.findById(id).get();
}
}
 