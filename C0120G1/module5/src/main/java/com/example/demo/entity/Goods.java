package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "goods")
public class Goods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "goods_id")
    private Integer id;

    @Column(name = "goods_name")
    private String goodName;

    @Column(name = "price")
    private Double price;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "trade_mark")
    private String tradeMark;

    @Column(name = "sale_off")
    private Integer saleOff;

    @Column(name = "delete_flag")
    private Integer deleteFlag;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Categories categories;

    @JsonBackReference(value = "goods")
   @OneToMany(mappedBy = "goods")
    private Set<Bill> bills;

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", goodName='" + goodName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", tradeMark='" + tradeMark + '\'' +
                ", saleOff=" + saleOff +
                ", deleteFlag=" + deleteFlag +
                ", categories=" + categories +
                ", bills=" + bills +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getTradeMark() {
        return tradeMark;
    }

    public void setTradeMark(String tradeMark) {
        this.tradeMark = tradeMark;
    }

    public Integer getSaleOff() {
        return saleOff;
    }

    public void setSaleOff(Integer saleOff) {
        this.saleOff = saleOff;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    public Set<Bill> getBills() {
        return bills;
    }

    public void setBills(Set<Bill> bills) {
        this.bills = bills;
    }
}