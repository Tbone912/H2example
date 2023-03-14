package com.H2.repository;

import com.H2.model.Movie;
 
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie, Integer> {}