package com.biddydev.twitterclone.models;

import javax.persistence.*;

@Entity
@Table(name = "comments")
public class Comment
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String content;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userid")
    private User user;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tweetid")
    private Tweet tweet;

    public Comment()
    {
    }

    public Comment(String content, User user)
    {
        this.content = content;
        this.user = user;
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getContent()
    {
        return content;
    }

    public void setContent(String content)
    {
        this.content = content;
    }

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }

    public Tweet getTweet()
    {
        return tweet;
    }

    public void setTweet(Tweet tweet)
    {
        this.tweet = tweet;
    }
}
