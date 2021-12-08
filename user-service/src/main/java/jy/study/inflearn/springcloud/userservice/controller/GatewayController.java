package jy.study.inflearn.springcloud.userservice.controller;

import jy.study.inflearn.springcloud.userservice.vo.Greeting;
import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class GatewayController {

    private final Environment env;

    private final Greeting greeting;

    @GetMapping("/health-check")
    public String status() {
        return "It's Working in User Service" +
                ", port(local.server.port)= " + env.getProperty("local.server.port") +
                ", port(server.port)= " + env.getProperty("server.port") +
                ", token secret= " + env.getProperty("token.secret") +
                ", token expiration time= " + env.getProperty("token.expiration_time");
    }

    @GetMapping("/welcome")
    public String welcome() {
        //return env.getProperty("greeting.message");
        return greeting.getMessage();
    }
}
