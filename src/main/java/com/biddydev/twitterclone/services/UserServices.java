package com.biddydev.twitterclone.services;

import com.biddydev.twitterclone.models.User;

import java.util.List;

public interface UserServices
{
    List<User> findAll();
    User save(User user);
}
