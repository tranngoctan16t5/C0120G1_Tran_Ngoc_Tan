package com.example.demo.repository;

import com.example.demo.entity.Goods;
import com.example.demo.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface GoodsRepository extends JpaRepository<Goods,Integer> {
    List<Goods> findAllByDeleteFlagIsNull();
    Page<Goods> findAllByDeleteFlagIsNull(Pageable pageable);
    Goods findAllByDeleteFlagIsNullAndIdIs(Integer id);
    Page<Goods> findAllByDeleteFlagIsNullAndGoodNameContainingIgnoreCase(String name, Pageable pageable);
}
