package com.weixin.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class WeiXinProperties {

    @Value("${xcx.appid}")
    private String appid;

    @Value("${xcx.appsecret}")
    private String appsecret;
}
