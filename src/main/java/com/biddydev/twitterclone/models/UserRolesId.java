package com.biddydev.twitterclone.models;

import java.io.Serializable;

public class UserRolesId implements Serializable
{
    private long user;
    private long role;

    public UserRolesId()
    {
    }

    public UserRolesId(long user, long role)
    {
        this.user = user;
        this.role = role;
    }

    public long getUser()
    {
        return user;
    }

    public void setUser(long user)
    {
        this.user = user;
    }

    public long getRole()
    {
        return role;
    }

    public void setRole(long role)
    {
        this.role = role;
    }

    @Override
    public int hashCode()
    {
        return 14;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj == this)
        {
            return true;
        }
        if(obj == null || obj.getClass() != this.getClass())
        {
            return false;
        }
        var that = (UserRolesId) obj;
        return (this.getRole() == that.getRole()) && (this.getUser() == that.getUser());
    }
}
