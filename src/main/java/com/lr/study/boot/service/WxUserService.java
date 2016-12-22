package com.lr.study.boot.service;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lr.study.boot.common.Response;
import com.lr.study.boot.dao.WxUserDao;
import com.lr.study.boot.entity.WxUser;

@Service
public class WxUserService {
	@Autowired
	private WxUserDao wxUserDao;
	
	private static final Logger logger = LoggerFactory.getLogger(WxUserService.class);
	
	public Response validateUser(Long account,String password){
		WxUser wu = wxUserDao.findByAccountNum(account);
		try {
			logger.info("wxuser = {}",BeanUtils.describe(wu));
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Response.success();
	}
}
