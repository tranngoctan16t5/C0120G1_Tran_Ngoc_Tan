package com.example.demo.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "fullname")
    private String fullName;

    @Column(name = "password")
    private String password;

    @Column(name = "delete_flag")
    private Integer deleteFlag;

    @OneToMany(mappedBy = "user")
    private Set<Bills> bills;




}
//user_id int primary key auto_increment,
//        fullname nvarchar(255),
//        password nvarchar(50),
//        goods_id int ,
//        delete_flag tinyint(4) default null,