package com.social.service.Implementation;

import com.social.model.Post;

import java.time.LocalDateTime;
import java.util.Random;

public class PostServiceImpl implements com.social.service.PostService {

    private final Random random;

    public PostServiceImpl() {
        this.random = new Random();
    }

    public Post createPost(String content)
    {
        if(content==null||content.isEmpty())
        {
            System.out.println("the content is invalid or empty");
            return null;
        }
         return new Post(random.nextInt(), content,LocalDateTime.now());
    }
}
