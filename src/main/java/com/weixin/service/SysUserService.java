/**
 * FileName: SysUserService
 * Author:   Carty.Li
 * Date:     2018/8/5 11:13
 * Description: 用户
 */
package com.weixin.service;

import com.weixin.mapper.SysUserMapper;
import com.weixin.model.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈用户〉
 *
 * @author Administrator
 * @create 2018/8/5
 * @since 1.0.0
 */
@Service
public class SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    public List<SysUser> selectAll(){
        return sysUserMapper.selectAll();
    }
}