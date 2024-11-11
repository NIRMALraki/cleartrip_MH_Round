package com.social.util;

import com.social.model.Post;
import com.social.model.User;
import com.social.repo.UserRepository;
import com.social.service.Implementation.PostServiceImpl;
import com.social.service.Implementation.UserServiceImpl;
import com.social.service.PostService;
import com.social.service.UserService;

import java.util.HashMap;
import java.util.Map;

public class Driver {

    public static void main(String[] args) {

        Map<Integer, User> registeredUser = new HashMap<>();
        UserRepository userRepository  = new UserRepository(registeredUser);
        UserService userService = new UserServiceImpl();
        PostService postService = new PostServiceImpl();

        //registerUser

        User user1 = new User(1,"user1");
        User user2 = new User(2,"user2");
        User user3 = new User(3,"user3");
        System.out.println(userService.registerUser(user1,userRepository));
        System.out.println(userService.registerUser(user2,userRepository));
        System.out.println(userService.registerUser(user3,userRepository));


        //add post
        Post post = postService.createPost("this is my first post");
        userService.uploadPost(post,5,userRepository);
//
//        //follow user
//
        userService.addUserToFollowerList(8,1,userRepository);
        userService.addUserToFollowerList(2,3,userRepository);
//
        System.out.println(userService.getAllFollowers(8,userRepository));
//
//        //unfollow user
//
//        userService.removeUserFromFollowerList(2,3,userRepository);
//        System.out.println(userService.getAllFollowers(2,userRepository));








    }
}
