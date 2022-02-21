package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface PostRespository extends CrudRepository <Post, Long>  {
    
}
