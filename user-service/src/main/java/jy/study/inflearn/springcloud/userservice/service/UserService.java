package jy.study.inflearn.springcloud.userservice.service;

import jy.study.inflearn.springcloud.userservice.dto.UserDto;
import jy.study.inflearn.springcloud.userservice.jpa.UserEntity;

public interface UserService {
    UserDto createUser(UserDto userDto);

    UserDto getUserById(String userId);

    Iterable<UserEntity> getUserByAll();
}
