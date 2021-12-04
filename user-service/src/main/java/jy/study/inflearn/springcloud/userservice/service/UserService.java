package jy.study.inflearn.springcloud.userservice.service;

import jy.study.inflearn.springcloud.userservice.dto.UserDto;
import jy.study.inflearn.springcloud.userservice.jpa.UserEntity;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    UserDto createUser(UserDto userDto);

    UserDto getUserById(String userId);

    Iterable<UserEntity> getUserByAll();
}
