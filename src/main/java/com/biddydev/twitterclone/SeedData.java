package com.biddydev.twitterclone;

import com.biddydev.twitterclone.models.User;
import com.biddydev.twitterclone.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SeedData implements CommandLineRunner
{

    @Autowired
    UserServices userServices;

    @Override
    public void run(String... args) throws Exception
    {
        User newUser = new User();
        newUser.setHandle("dudeperson");
        newUser.setEmail("dudeperson@dadude.com");
        newUser.setPassword("lifesagarden...digit");
        userServices.save(newUser);
    }
}
