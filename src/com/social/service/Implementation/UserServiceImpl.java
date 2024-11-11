package com.social.service.Implementation;

import com.social.model.Post;
import com.social.model.User;
import com.social.repo.UserRepository;
import com.social.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Override
    public User registerUser(User user, UserRepository userRepository)
    {
        if(user==null)
        {
            System.out.println("invalid user data");
            return null;
        }

        userRepository.addUser(user);
        return user;
    }

    @Override
    public Post uploadPost(Post post, int userId, UserRepository userRepository)
    {
        User currentUser = userRepository.getUserById(userId);
        if(currentUser==null)
        {
            System.out.println("User not found");
            return null;
        }
        currentUser.getPosts().add(post);

        return post;
    }

    @Override
    public String addUserToFollowerList(int mainUserId, int followerId, UserRepository userRepository)
    {
        User currentUser = userRepository.getUserById(mainUserId);
        User follower = userRepository.getUserById(followerId);

        if(currentUser == follower) return "invalid follow request";
        if(currentUser==null)
        {
            System.out.println("User data not found");
            return null;
        }

        if(follower==null)
        {
            System.out.println("follower data not found");
            return null;
        }

        currentUser.getFollowers().add(follower);
        return "followed "+ currentUser.getName()+"!!";
    }

    @Override
    public String removeUserFromFollowerList(int mainUserId, int followerId, UserRepository userRepository)
    {
        User currentUser = userRepository.getUserById(mainUserId);
        User follower = userRepository.getUserById(followerId);
        if(currentUser==null)
        {
            System.out.println("User data not found");
            return null;
        }

        if(follower==null)
        {
            System.out.println("follower data not found");
            return null;
        }

        currentUser.getFollowers().remove(follower);
        return "unfollowed "+ currentUser.getName()+"!!";
    }

    public List<User> getAllFollowers(int userid,UserRepository userRepository)
    {
       User currentUser= userRepository.getUserById(userid);
        if(currentUser==null)
        {
            System.out.println("User data not found");
            return null;
        }

        return currentUser.getFollowers();
    }
}
