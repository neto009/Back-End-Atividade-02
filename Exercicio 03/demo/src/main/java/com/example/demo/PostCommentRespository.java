package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface PostCommentRespository extends CrudRepository <PostComment, Long>  {
    
}
