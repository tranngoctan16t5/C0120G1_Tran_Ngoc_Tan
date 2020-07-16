package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "categories")
public class Categories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Integer id;

    @Column(name = "category_name")
    private String categoryName;

    @Column(name = "delete_flag")
    private Integer deleteFlag;

    @JsonBackReference(value = "categories")
    @OneToMany(mappedBy = "categories")
    private Set<Goods> goods;

    @Override
    public String toString() {
        return "Categories{" +
                "id=" + id +
                ", categoryName='" + categoryName + '\'' +
                ", deleteFlag=" + deleteFlag +
                ", goods=" + goods +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Set<Goods> getGoods() {
        return goods;
    }

    public void setGoods(Set<Goods> goods) {
        this.goods = goods;
    }
}
