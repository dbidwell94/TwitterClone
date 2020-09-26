package com.biddydev.twitterclone.services;

import com.biddydev.twitterclone.models.Role;

import java.util.List;

public interface RoleServices
{
    List<Role> findAll();
    Role save(Role role);
}
