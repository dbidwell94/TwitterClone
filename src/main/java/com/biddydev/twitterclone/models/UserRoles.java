package com.biddydev.twitterclone.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "userroles")
@IdClass(UserRolesId.class)
public class UserRoles implements Serializable
{
    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userid")
    private User user;

    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "roleid")
    private Role role;

    public UserRoles()
    {
    }

    public UserRoles(User user, Role role)
    {
        this.user = user;
        this.role = role;
    }

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }

    public Role getRole()
    {
        return role;
    }

    public void setRole(Role role)
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
        var that = (UserRoles) obj;

        return (this.getRole() == null ? 0 : this.getRole().getId()) == (that.getRole() == null ? 0 : that.getRole().getId()) &&
                ((this.getUser() == null ? 0 : this.getUser().getId()) == (that.getUser() == null ? 0 : that.getUser().getId()));
    }
}
