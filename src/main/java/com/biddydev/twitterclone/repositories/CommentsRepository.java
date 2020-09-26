package com.biddydev.twitterclone.repositories;

import com.biddydev.twitterclone.models.Comment;
import org.springframework.data.repository.CrudRepository;

public interface CommentsRepository extends CrudRepository<Comment, Long>
{
}
