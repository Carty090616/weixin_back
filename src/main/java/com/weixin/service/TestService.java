/**
 * Copyright (C), 2015-2018, 章鱼云商
 * FileName: TestService
 * Author:   Lifeifei
 * Date:     2018/8/9 9:10
 * Description: 测试服务类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.weixin.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * 〈测试服务类〉
 *
 * @author Lifeifei
 * @create 2018/8/9
 * @since 1.0.0
 */
@Service
public class TestService {

    /**
     * <测试async(异步)>
     *
     *     @Async 与 @Transactional会有冲突
     *
     * @param
     * @return void
     * @author Lifeifei
     * @date 2018/8/9 9:12
     */
    @Async
    public void testAsync() {
        System.out.println("执行任务一" + System.currentTimeMillis());

        //模拟执行任务一花费的时间
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("执行任务二" + System.currentTimeMillis());
    }
}