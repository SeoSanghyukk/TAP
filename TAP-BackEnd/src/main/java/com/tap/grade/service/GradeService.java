package com.tap.grade.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tap.grade.dao.GradeDAO;
import com.tap.grade.dto.GradeDTO;

import jakarta.transaction.Transactional;
@Service
public class GradeService {
	@Autowired
	private GradeDAO gDao;
    public List<GradeDTO> getGrade() throws Exception{
    	return gDao.getGrade();
    }
	public List<GradeDTO> selectAll() throws Exception {
		return gDao.selectAll();
		}
	public Map<String, Object> selectList(Map<String, Object> map)  throws Exception{
		if(((String)map.get("target")).equals("grade_order")) {
			if(((String)map.get("keyword")).equals("")) {
				map.put("target","");
			}
		}
		
		Map<String, Object> result =new HashMap<>();
		result.put("list", gDao.selectList(map));
		result.put("count", gDao.getCount(map));
		
		return result;
	}
	@Transactional
	public int delete(int seq,int gradeOrder)  throws Exception{
		int result =gDao.delete(seq);
		 gDao.updateByDelete(gradeOrder);
		return result;
	}
	
	@Transactional
	public int insert(GradeDTO dto)  throws Exception{
		gDao.updateByAdd(dto.getGrade_order());
		return gDao.insert(dto);
		
	}
	public boolean checkName(String name) {
		return gDao.checkName(name);
	}

}
