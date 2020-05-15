package com.mj.springboot.shiro;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mj.springboot.entity.User;
import com.mj.springboot.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

public class ShiroRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String userName = (String) authenticationToken.getPrincipal();
        String password = new String((char[]) authenticationToken.getCredentials());
        User user = new User();
        user.setName(userName);
        user.setPassword(password);
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>(user);
        User one = userService.getOne(userQueryWrapper);
        if (one == null) {
            throw new UnknownAccountException("用户名或密码错误!");
        }
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user, user.getPassword(), getName());
        return info;
    }
}
