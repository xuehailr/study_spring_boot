package com.lr.study.boot.config;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.Filter;

import org.apache.shiro.cas.CasFilter;
import org.apache.shiro.cas.CasSubjectFactory;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShiroConfig {
	
	@Autowired
	private Realm realm;
	
	@Bean("securityManager")
	public DefaultWebSecurityManager getSecurityManager(){
		DefaultWebSecurityManager dwsm = new DefaultWebSecurityManager();
		dwsm.setSubjectFactory(new CasSubjectFactory());
		dwsm.setRealm(realm);
		return dwsm;
	}
	@Bean("shiroFilter")
	public ShiroFilterFactoryBean getShiroFilter(DefaultWebSecurityManager securityManager){
		ShiroFilterFactoryBean shiroFilter = new ShiroFilterFactoryBean();
		shiroFilter.setSecurityManager(securityManager);
		shiroFilter.setLoginUrl("login");
		shiroFilter.setSuccessUrl("");
		Map<String ,Filter> filters = new HashMap<String ,Filter>();
		filters.put("cas", new MyCasFilter());
		filters.put("acc", new MultiAccControlFilter());
		shiroFilter.setFilters(filters);
		Map<String,String> filterChainDefinitionMap = new LinkedHashMap<String,String>();
		filterChainDefinitionMap.put("/wxcust/**", "anon");
		filterChainDefinitionMap.put("/cas", "cas");
		filterChainDefinitionMap.put("/**", "user,acc");
		
		shiroFilter.setFilterChainDefinitionMap(filterChainDefinitionMap);
		return shiroFilter;
	}
	/*@Bean("casFilter")
	public Filter getCasFilter(){
		return new MyCasFilter();
	}
	@Bean("accFilter")
	public Filter getAccFilter(){
		return new MultiAccControlFilter();
	}*/
	
	
}
