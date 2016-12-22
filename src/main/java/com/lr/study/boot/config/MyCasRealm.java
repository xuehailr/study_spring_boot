package com.lr.study.boot.config;

import org.apache.shiro.cas.CasRealm;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component("casRealm")
@ConfigurationProperties("cas")
public class MyCasRealm extends CasRealm{
	private String casServerUrlPrefix;
	private String casService;
	public String getCasServerUrlPrefix() {
		return casServerUrlPrefix;
	}
	public void setCasServerUrlPrefix(String casServerUrlPrefix) {
		this.casServerUrlPrefix = casServerUrlPrefix;
	}
	public String getCasService() {
		return casService;
	}
	public void setCasService(String casService) {
		this.casService = casService;
	}
	
}
