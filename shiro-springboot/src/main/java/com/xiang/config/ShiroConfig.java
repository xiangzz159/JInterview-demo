package com.xiang.config;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author：Yerik Xiang
 * @Date：2021/5/19 22:32
 * @Desc：
 */

@Configuration
public class ShiroConfig {

    // ShiroFilterFactory:3
    @Bean
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("securityManager") DefaultWebSecurityManager securityManager) {
        ShiroFilterFactoryBean bean = new ShiroFilterFactoryBean();
        // 设置安全管理器
        bean.setSecurityManager(securityManager);

        // 添加shiro内置过滤器
        /**
         * anon:无需认证可以访问
         * authc:必须认证才能访问
         * user:必须拥有记住我功能才能用
         * perms:拥有对某个资源的权限才能访问
         * role:拥有某个角色权限才能访问
         */
        Map<String, String> filterMap = new LinkedHashMap<>();
//        filterMap.put("/user/add", "authc");
//        filterMap.put("/user/update", "authc");
        // 授权
        filterMap.put("/user/add", "perms[user:add]");
        // 拦截
        filterMap.put("/user/*", "authc");
        bean.setFilterChainDefinitionMap(filterMap);
        bean.setLoginUrl("/toLogin");
        bean.setUnauthorizedUrl("/unauth");
        return bean;
    }

    // DefaultWebSecurityManager:2
    @Bean(name = "securityManager")
    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("userRealm") UserRealm userRealm) {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        // 关联UserRealm
        securityManager.setRealm(userRealm);
        return securityManager;
    }

    // 创建realm对象，需要自定义类：1
    @Bean
    public UserRealm userRealm() {
        return new UserRealm();
    }
}
