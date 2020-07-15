package com.example.demo.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "categories")
public class Categories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "category_name")
    private String categoryName;

    @Column(name = "delete_flag")
    private  Integer deleteFlag;

    @OneToMany(mappedBy = "categories")
    private Set<Goods> goods;
}
