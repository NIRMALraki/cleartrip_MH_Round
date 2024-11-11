package com.social.model;

import java.util.ArrayList;
import java.util.List;

public class User {

    private int id;
    private String name;
    private List<User> followers;
    private List<Post> posts;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.followers = new ArrayList<>();
        this.posts = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getFollowers() {
        return followers;
    }

    public void setFollowers(List<User> followers) {
        this.followers = followers;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", followers=" + followers +
                ", posts=" + posts +
                '}';
    }
}
