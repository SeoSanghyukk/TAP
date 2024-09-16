package com.tap.admin.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AdminProductDAO {
	@Autowired
	private SqlSession mybatis;
	
	public List<HashMap<String, Object>> getCurrentProductsByCategory(String category){
		return mybatis.selectList("AdminProduct.getCurrentProductsByCategory", category);
	}
	public List<HashMap<String, Object>> getFutureProductsByCategory(String category){
		return mybatis.selectList("AdminProduct.getFutureProductsByCategory", category);
	}
	public List<HashMap<String, Object>> getPastProductsByCategory(String category){
		return mybatis.selectList("AdminProduct.getPastProductsByCategory", category);
	}
	// 상품 신청 갯수 
	public int getCountProductsWaiting(String category){
		return mybatis.selectOne("AdminProduct.getCountProductsWaiting", category);
	}
	public int getCountProductsResult(String category){
		return mybatis.selectOne("AdminProduct.getCountProductsResult", category);
	}
	// 신청 대기 상품 리스트 - 카테고리 별로
	public List<HashMap<String, Object>> getWaitingProductsByCategory(String category){
		return mybatis.selectList("AdminProduct.getWaitingProductsByCategory", category);
	}
	// 신청 결과 상품 리스트 - 카테고리 별로 , 최근 3개월분 
	public List<HashMap<String, Object>> getResultProductsByCategory(String category){
		return mybatis.selectList("AdminProduct.getResultProductsByCategory", category);
	}
}
