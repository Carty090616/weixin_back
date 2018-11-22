/**
 * FileName: SysUserController
 * Author:   Carty.Li
 * Date:     2018/8/5 11:15
 * Description: 用户
 */
package com.weixin.controller;

import com.weixin.model.SysUser;
import com.weixin.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈用户〉
 *
 * @author Administrator
 * @create 2018/8/5
 * @since 1.0.0
 */
@RestController
@RequestMapping("/user")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    /**
     * <查询全部>
     *
     * @param 
     * @return java.util.List<com.weixin.model.SysUser>
     * @author Lifeifei
     * @date 2018/8/9 9:23 
     */
    @PostMapping("/select")
    public List<SysUser> selectAll(){
        List<SysUser> list = new ArrayList<>();

        SysUser user1 = new SysUser();
        user1.setId(1);
        user1.setName("name1");
        user1.setRemark("remark1");
        SysUser user2 = new SysUser();
        user2.setId(2);
        user2.setName("name2");
        user2.setRemark("remark2");
        SysUser user3 = new SysUser();
        user3.setId(3);
        user3.setName("name3");
        user3.setRemark("remark3");

        list.add(user1);
        list.add(user2);
        list.add(user3);

        return list;
    }
}
