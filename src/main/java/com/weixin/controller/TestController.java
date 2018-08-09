/**
 * Copyright (C), 2015-2018, 章鱼云商
 * FileName: TestController
 * Author:   Lifeifei
 * Date:     2018/8/9 9:09
 * Description: 测试控制类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.weixin.controller;

import com.weixin.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * 〈测试控制类〉
 *
 * @author Lifeifei
 * @create 2018/8/9
 * @since 1.0.0
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    /**
     * <测试async(异步)>
     *
     * @param
     * @return void
     * @author Lifeifei
     * @date 2018/8/9 9:12
     */
    @PostMapping("/async")
    public String testAsync() {
        testService.testAsync();
        return "success" + System.currentTimeMillis();
    }
}