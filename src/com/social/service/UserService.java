package com.social.service;

import com.social.model.Post;
import com.social.model.User;
import com.social.repo.UserRepository;

import java.util.List;

public interface UserService {
    User registerUser(User user, UserRepository userRepository);

    Post uploadPost(Post post, int userId, UserRepository userRepository);

    String addUserToFollowerList(int mainUserId, int followerId, UserRepository userRepository);

    String removeUserFromFollowerList(int mainUserId, int followerId, UserRepository userRepository);

    public List<User> getAllFollowers(int userid, UserRepository userRepository);
}
