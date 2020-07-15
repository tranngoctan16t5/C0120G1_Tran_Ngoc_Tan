package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "goods")
public class Goods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "goods_id")
    private Integer id;

    @Column(name = "goods_name")
    private String name;

    @Column(name = "price")
    private Double price;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "trade_mark")
    private String tradeMark;

    @Column(name ="sale_off" )
    private Integer saleOff;

    @Column(name = "delete_flag")
    private Integer deleteFlag;

    @ManyToOne
    @JoinColumn(name = "category_id",nullable =false)
    private Categories categories;



//    goods_id int primary key AUTO_INCREMENT,
//    goods_name nvarchar(50),
//    price double,
//    quantity int,
//    trade_mark nvarchar(255),
//    sale_off int,
//    category_id int,
//    delete_flag tinyint(4) default null,
}
