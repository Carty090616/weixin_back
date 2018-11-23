package com.weixin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication(scanBasePackages={"com.weixin.*"})
@EnableAsync// 为了让@Async注解能够生效
public class WeixinApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeixinApplication.class, args);
	}
}
