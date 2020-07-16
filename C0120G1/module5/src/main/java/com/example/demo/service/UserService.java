package com.example.demo.service;

import com.example.demo.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserService {
   List<User> getAllUser();
   Page<User> getAllUserByName(String name, Pageable pageable);
   User findById(Integer id);
   void remove(Integer id);
   void save (User user);




}
