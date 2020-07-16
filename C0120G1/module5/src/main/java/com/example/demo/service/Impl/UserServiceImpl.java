package com.example.demo.service.Impl;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getAllUser() {
        return userRepository.findAllByDeleteFlagIsNull();
    }

    @Override
    public Page<User> getAllUserByName(String name, Pageable pageable) {
        return userRepository.findAllByDeleteFlagIsNullAndFullNameContainingIgnoreCase(name, pageable);
    }

    @Override
    public User findById(Integer id) {
        return userRepository.findAllByDeleteFlagIsNullAndIdIs(id);
    }

    @Override
    public void remove(Integer id) {
        User user = userRepository.findAllByDeleteFlagIsNullAndIdIs(id);
        user.setDeleteFlag(1);
        userRepository.save(user);
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }
}
