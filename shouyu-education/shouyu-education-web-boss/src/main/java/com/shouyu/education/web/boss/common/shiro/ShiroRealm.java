package com.shouyu.education.web.boss.common.shiro;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * TODO
 *
 * @author 高露 邮箱：<a href="egojit@qq.com">egojit@qq.com</a>
 * @since 2019-08-01 14:54
 */
public class ShiroRealm extends AuthorizingRealm {

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        return simpleAuthorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken arg0) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) arg0;
        return new SimpleAuthenticationInfo(token, token.getPassword(), getName());
    }

}