package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class PostComment {
    

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Post post;
    private String review;

    @ManyToOne
    private Post postagem;

    public PostComment() {
    }

    public PostComment(Long id, Post post, String review, Post postagem) {
        this.id = id;
        this.post = post;
        this.review = review;
        this.postagem = postagem;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Post getPost() {
        return this.post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public String getReview() {
        return this.review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public Post getPostagem() {
        return this.postagem;
    }

    public void setPostagem(Post postagem) {
        this.postagem = postagem;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", post='" + getPost() + "'" +
            ", review='" + getReview() + "'" +
            ", postagem='" + getPostagem() + "'" +
            "}";
    }

}
