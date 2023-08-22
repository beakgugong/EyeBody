package com.kr.EyeBody.src.Service;

import com.kr.EyeBody.src.Entity.Users;
import com.kr.EyeBody.src.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public Users read(Long id) {
        Users user = userRepository.findById(id).orElse(null);

        return user;
    }
}
