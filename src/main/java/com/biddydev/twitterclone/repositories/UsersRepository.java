package com.biddydev.twitterclone.repositories;

import com.biddydev.twitterclone.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<User, Long>
{
}
