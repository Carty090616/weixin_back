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

    /**
     * <查询全部>
     *
     * @param
     * @return java.util.List<com.weixin.model.SysUser>
     * @author Lifeifei
     * @date 2018/8/9 9:03
     */
    public List<SysUser> selectAll(){
        return sysUserMapper.selectAll();
    }
}