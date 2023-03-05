package com.soccer.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MovieRepository  extends JpaRepository<Movie, Long>{

	Page<Movie> findByTitleLike(String title,Pageable pageable);
}
