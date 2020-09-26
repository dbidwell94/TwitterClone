package com.biddydev.twitterclone.repositories;

import com.biddydev.twitterclone.models.Tweet;
import org.springframework.data.repository.CrudRepository;

public interface TweetsRepositories extends CrudRepository<Tweet, Long>
{
}
