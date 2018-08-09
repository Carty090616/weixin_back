/**
 * FileName: SysUser
 * Author:   Carty.Li
 * Date:     2018/8/5 11:06
 * Description: 用户
 */
package com.weixin.mapper;

import java.util.List;

import com.weixin.mapper.base.MyBaseMapper;
import com.weixin.model.SysUser;

/**
 * 〈用户〉
 *
 * @author Administrator
 * @create 2018/8/5
 * @since 1.0.0
 */
public interface SysUserMapper extends MyBaseMapper {

    List<SysUser> selectAll();
}