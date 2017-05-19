package org.lucien.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@EnableAutoConfiguration
@Configuration
@ComponentScan
public class MainController {

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "Hello World!";
    }

    //访问所有的用户信息
    public static void main(String[] args) throws Exception {
        SpringApplication.run(MainController.class, args);
    }
}
