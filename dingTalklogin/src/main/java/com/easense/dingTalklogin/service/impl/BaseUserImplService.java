package com.easense.dingTalklogin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easense.dingTalklogin.bean.BaseUser;
import com.easense.dingTalklogin.dao.BaseUserMapper;

@Service
public class BaseUserImplService {
	
	@Autowired
	private BaseUserMapper baseUserMapper;

	
	public List<BaseUser> selectAll(){
		
		return baseUserMapper.selectAll();
	}
	
	
	public BaseUserMapper getBaseUserMapper() {
		return baseUserMapper;
	}

	public void setBaseUserMapper(BaseUserMapper baseUserMapper) {
		this.baseUserMapper = baseUserMapper;
	}
	
	
	
}
