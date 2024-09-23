package com.tap.coupon.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tap.coupon.dto.CouponDTO;

@Repository
public class CouponDAO {
	@Autowired
	private SqlSession mybatis;

	public void insert(CouponDTO item) {
		mybatis.insert("Coupon.insert",item);
		
	}
}
