package jy.study.inflearn.springcloud.userservice.service;

import jy.study.inflearn.springcloud.userservice.dto.UserDto;

public interface UserService {
    UserDto createUser(UserDto userDto);
}
