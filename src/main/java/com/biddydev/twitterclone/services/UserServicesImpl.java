package com.biddydev.twitterclone.services;

import com.biddydev.twitterclone.models.Tweet;
import com.biddydev.twitterclone.models.User;
import com.biddydev.twitterclone.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServicesImpl implements UserServices
{
    @Autowired
    UsersRepository usersRepository;

    @Override
    public List<User> findAll()
    {
        List<User> users = new ArrayList<>();
        usersRepository.findAll().iterator().forEachRemaining(users::add);
        return users;
    }

    @Override
    public User save(User user)
    {
        User newUser = new User();
        newUser.setEmail(user.getEmail());
        newUser.setHandle(user.getHandle());
        newUser.setPassword(user.getPassword());
        for(Tweet t : user.getTweets())
        {
            newUser.getTweets().add(t);
        }
        return usersRepository.save(newUser);
    }
}
