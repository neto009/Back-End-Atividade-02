package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Post {
    

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;

    @OneToMany
    private List<PostComment> comment;


    public Post() {
    }

    public Post(Long id, String title, List<PostComment> comment) {
        this.id = id;
        this.title = title;
        this.comment = comment;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<PostComment> getComment() {
        return this.comment;
    }

    public void setComment(List<PostComment> comment) {
        this.comment = comment;
    }

    public Post addComment(PostComment) {
        return this.postagem;
    }

    public void setaddComment(PostComment) {
        this.postagem = postagem;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", title='" + getTitle() + "'" +
            ", comment='" + getComment() + "'" +
            "}";
    }

}
