package com.example.watchlist.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@jakarta.persistence.Entity
public class Movie {
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO) 
	 private int id;
 private String MovieName;
 private float ratings;
 private String priority;
 private String Heroes_name ;
public int getid() {
	return id;
}
public void setid(int id) {
	this.id = id;
}
public String getMovieName() {
	return MovieName;
}
public void setMovieName(String movieName) {
	MovieName = movieName;
}
public float getRatings() {
	return ratings;
}
public void setRatings(float ratings) {
	this.ratings = ratings;
}
public  String getPriority() {
	return priority;
}
public  void setPriority( String priority) {
	this.priority = priority;
}
public String getHeroes_name() {
	return Heroes_name;
}
public void setHeroes_name(String heroes_name) {
	this.Heroes_name = heroes_name;
}
	
	
	
}
