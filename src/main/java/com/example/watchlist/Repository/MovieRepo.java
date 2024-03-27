package com.example.watchlist.Repository;

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository;

import com.example.watchlist.entity.Movie;
 
@Repository
	public interface  MovieRepo extends JpaRepository< Movie , Integer> {
}
