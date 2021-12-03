package jy.study.inflearn.springcloud.userservice.vo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "greeting")
public class Greeting {

    private String message;
}
