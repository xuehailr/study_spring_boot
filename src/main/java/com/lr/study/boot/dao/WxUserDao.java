package com.lr.study.boot.dao;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.lr.study.boot.entity.WxUser;

public interface WxUserDao extends JpaSpecificationExecutor<WxUser>,
		PagingAndSortingRepository<WxUser, Long> {
	
	WxUser findByAccountNum(Long accountNum);
}
