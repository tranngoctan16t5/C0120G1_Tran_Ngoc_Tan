package com.example.demo.service;

import com.example.demo.entity.Goods;
import com.example.demo.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface GoodsService {
    List<Goods> getAllGoods();
    Page<Goods> getAllUserByName(String name, Pageable pageable);
    Goods findById(Integer id);
    void remove(Integer id);
    void save (Goods goods);
}
