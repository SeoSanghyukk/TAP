package com.tap.delivery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tap.delivery.dao.deliveryDAO;
import com.tap.delivery.dto.DeliveryDTO;
import com.tap.members.dto.MembersDeliveryDTO;

@Service
public class deliveryService {
	
	@Autowired
	private deliveryDAO dao;
	
	public int insert(MembersDeliveryDTO dto) throws Exception{
		return dao.insert(dto);
	}
	
	public int insert(DeliveryDTO dto) throws Exception{
		return dao.insert(dto);
	}

	public List<DeliveryDTO> selectById(String username) {
		return dao.selectById(username);
	}

}
