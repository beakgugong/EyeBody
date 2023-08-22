package com.kr.EyeBody.src.Controller;

import com.kr.EyeBody.src.Entity.Record;
import com.kr.EyeBody.src.Entity.Users;
import com.kr.EyeBody.src.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/User/{id}")
    public Users read(@PathVariable(value = "id")Long id){
        Users user = userService.read(id);
        return user;
    }
}
