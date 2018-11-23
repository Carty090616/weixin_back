package com.weixin.service;

import com.weixin.config.WeiXinProperties;
import me.chanjar.weixin.common.error.WxErrorException;
import me.chanjar.weixin.mp.bean.result.WxMpOAuth2AccessToken;
import me.chanjar.weixin.open.api.impl.WxOpenServiceApacheHttpClientImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService extends WxOpenServiceApacheHttpClientImpl {

    @Autowired
    private WeiXinProperties weiXinProperties;

    public void login(String code) throws WxErrorException {

        WxMpOAuth2AccessToken wxMpOAuth2AccessToken = super.getWxOpenComponentService().oauth2getAccessToken(weiXinProperties.getAppid(), code);

        System.out.println(wxMpOAuth2AccessToken);
    }
}
