package jy.study.inflearn.springcloud.userservice.vo;

import lombok.Data;

@Data
public class ResponseUser {
    private String email;
    private String name;
    private String userId;
}
