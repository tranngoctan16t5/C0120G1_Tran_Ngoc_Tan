package com.example.demo.controller;

import com.example.demo.entity.Goods;
import com.example.demo.entity.User;
import com.example.demo.service.GoodsService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping(value = "/goods")
public class GoodController {
    @Autowired
    GoodsService goodsService;
        @GetMapping("")
    public List<Goods> getAllGoods() {
        List<Goods> goods;
        goods = goodsService.getAllGoods();
        return goods;

    }
    @GetMapping("/list")
    public ModelAndView creatFormCustomer() {
        return new ModelAndView("goods/list");
    }


}

