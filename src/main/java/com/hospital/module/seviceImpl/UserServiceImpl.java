package com.hospital.module.seviceImpl;

import com.hospital.module.dto.UserLoginDto;
import com.hospital.module.entities.User;
import com.hospital.module.repositories.UserRepository;
import com.hospital.module.servive.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public User addUser(User user) {
        User save = userRepository.save(user);
        if (save!=null){
            return save;
        }
        return null;
    }

    @Override
    public User fetchUser(UserLoginDto userLoginDto) {
        User user = userRepository.findByEmailAndPassword(userLoginDto.getEmail(), userLoginDto.getPassword());
        return user;
    }
}
