package com.ahzx;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author think
 * @Date 2021/4/2 16:50
 * @Version 1.0
 */
@RestController
public class IndexController {
    HelloProperties helloProperties;

    public IndexController(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }

    @RequestMapping("/")
    public String index() {
        return helloProperties.getName() + "欢迎您";
    }
}
