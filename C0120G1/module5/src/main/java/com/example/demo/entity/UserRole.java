package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "user_role")
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "delele_flag")
    private Integer deleteFlag;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;



    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    @Override
    public String toString() {
        return "UserRole{" +
                "id=" + id +
                ", user=" + user +
                ", deleteFlag=" + deleteFlag +
                ", role=" + role +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
