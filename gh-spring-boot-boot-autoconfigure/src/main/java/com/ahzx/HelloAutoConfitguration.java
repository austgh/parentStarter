package com.ahzx; /**
 * @Author think
 * @Date 2021/4/2 16:53
 * @Version 1.0
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value = "gh.hello.name")
@EnableConfigurationProperties(HelloProperties.class)
public class HelloAutoConfitguration {
    @Autowired
    HelloProperties helloProperties;

    @Bean
    public IndexController indexController() {
        return new IndexController(helloProperties);
    }
}
