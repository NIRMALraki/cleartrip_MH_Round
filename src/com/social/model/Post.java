package com.social.model;

import java.time.LocalDateTime;

public class Post {

    private int id;
    private String content;
    private LocalDateTime createdTimeAndDate;


    public Post(int id, String content, LocalDateTime createdTimeAndDate) {
        this.id = id;
        this.content = content;
        this.createdTimeAndDate = createdTimeAndDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreatedTimeAndDate() {
        return createdTimeAndDate;
    }

    public void setCreatedTimeAndDate(LocalDateTime createdTimeAndDate) {
        this.createdTimeAndDate = createdTimeAndDate;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", createdTimeAndDate=" + createdTimeAndDate +
                '}';
    }
}
