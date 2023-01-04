package com.ahzx;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author think
 * @Date 2021/4/2 16:48
 * @Version 1.0
 */
@ConfigurationProperties("gh.hello")
public class HelloProperties {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
}
