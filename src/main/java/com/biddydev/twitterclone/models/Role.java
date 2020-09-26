package com.biddydev.twitterclone.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "roles")
public class Role
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true)
    private String name;

    @OneToMany(mappedBy = "role", orphanRemoval = true)
    private Set<UserRoles> users = new HashSet<>();

    public Role()
    {
    }

    public Role(String name)
    {
        this.name = name;
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Set<UserRoles> getUsers()
    {
        return users;
    }

    public void setUsers(Set<UserRoles> users)
    {
        this.users = users;
    }
}
