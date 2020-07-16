package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    List<User> findAllByDeleteFlagIsNull();
    Page<User> findAllByDeleteFlagIsNull(Pageable pageable);
    User findAllByDeleteFlagIsNullAndIdIs(Integer id);
    Page<User> findAllByDeleteFlagIsNullAndFullNameContainingIgnoreCase(String name, Pageable pageable);
}
