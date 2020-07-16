package com.example.demo.service.Impl;

import com.example.demo.entity.Goods;
import com.example.demo.repository.GoodsRepository;
import com.example.demo.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    GoodsRepository goodsRepository;
    @Override
    public List<Goods> getAllGoods() {
        return goodsRepository.findAllByDeleteFlagIsNull() ;
    }

    @Override
    public Page<Goods> getAllUserByName(String name, Pageable pageable) {
        return goodsRepository.findAllByDeleteFlagIsNull(pageable);
    }

    @Override
    public Goods findById(Integer id) {
        return goodsRepository.findAllByDeleteFlagIsNullAndIdIs(id);
    }

    @Override
    public void remove(Integer id) {
       Goods goods = goodsRepository.findAllByDeleteFlagIsNullAndIdIs(id);
       goods.setDeleteFlag(1);
       goodsRepository.save(goods);

    }

    @Override
    public void save(Goods goods) {
       goodsRepository.save(goods);
    }
}
