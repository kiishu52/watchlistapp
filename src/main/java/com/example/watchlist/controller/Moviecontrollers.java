package com.example.watchlist.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.example.watchlist.Service.DatabaseService;
 
import com.example.watchlist.entity.Movie;

@RestController
public class  Moviecontrollers {
	
	@Autowired
	 DatabaseService databaseService;
	
@GetMapping("/Watchlistitemform")
	public ModelAndView showsubmit(@RequestParam(required=false) Integer id) {
		
	String viewname = "submit";
	Map<String,Object> model=new HashMap<>();
 if(id==null) {
	 model.put("watchlistItem", new Movie ()); 
 }
 else {
	model.put("watchlistItem", databaseService.getmoviebyid(id));
}
	 

	return new ModelAndView(viewname,model);
	 
  }
 
@PostMapping("/Watchlistitemform")
public ModelAndView submitWatchlistForm(Movie movie){
	Integer id= movie.getid();
 
 
	RedirectView rd  =new RedirectView();
	rd.setUrl("/watchlist");
	return new ModelAndView(rd);
	 
}
@GetMapping("/watchlist")
 public ModelAndView getWatchlist() {
	// TODO Auto-generated method stub
   String viewname ="watchlist";
   Map<String,Object> model=new HashMap<>();
   List<Movie> movieList=databaseService.getAllMovie();
   model.put("watchlistrows", movieList);
   model.put("noofmovies", movieList.size());
   return new ModelAndView(viewname,model);
}

	
 }
    

