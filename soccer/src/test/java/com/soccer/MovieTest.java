package com.soccer;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.aspectj.lang.annotation.After;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import com.soccer.repository.Movie;
import com.soccer.repository.MovieRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MovieTest {
	
	@Autowired
    MovieRepository movieRepository;
//
//    @After(value = "")
//    public void cleanup(){
//    	movieRepository.deleteAll();
//    }

    @Test
    public void 게시글저장_불러오기(Pageable pageable){
    	
    	Page<Movie> result = movieRepository.findByTitleLike("%a%",pageable);
    	System.out.println(result);
    	}
}
