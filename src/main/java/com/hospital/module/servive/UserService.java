package com.hospital.module.servive;

import com.hospital.module.dto.UserLoginDto;
import com.hospital.module.entities.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User addUser(User user);
    User fetchUser(UserLoginDto userLoginDto);
}
