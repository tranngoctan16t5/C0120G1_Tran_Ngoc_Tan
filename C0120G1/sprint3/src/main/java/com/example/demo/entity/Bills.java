package com.example.demo.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Bills {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "delete_flag")
    private Integer deleteFlag;

    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    private Users users;


}
//bill_id int primary key auto_increment,
//        create_date date,
//        bill_type int,
//        quantity int,
//        user_id int,
//        delete_flag tinyint(4) default null,