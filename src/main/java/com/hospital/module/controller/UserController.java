package com.hospital.module.controller;

import com.hospital.module.dto.UserLoginDto;
import com.hospital.module.entities.User;
import com.hospital.module.servive.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hospital")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/signUp")
    public ResponseEntity<Object> addUser(@RequestBody User user){
        User addUser = userService.addUser(user);
        if (addUser!=null) {
            return new ResponseEntity<>("User added",HttpStatus.OK);
        }
        return null;
    }
    @PostMapping("/login")
    public ResponseEntity<Object> userLogin(@RequestBody UserLoginDto userLoginDto){
        User user = userService.fetchUser(userLoginDto);
        if (user!=null){
            return new ResponseEntity<>("User successfully Login",HttpStatus.OK);
        }
   return new ResponseEntity<>("Wrong credentials",HttpStatus.BAD_REQUEST);
    }
}
