/**
 * FileName: SysUser
 * Author:   Carty.Li
 * Date:     2018/8/5 10:53
 * Description: 用户model
 */
package com.weixin.model;

import lombok.Getter;
import lombok.Setter;

/**
 * 〈用户model〉
 *
 * @author Administrator
 * @create 2018/8/5
 * @since 1.0.0
 */
@Setter
@Getter
public class SysUser {

    private int id;

    private String name;

    private String remark;
}