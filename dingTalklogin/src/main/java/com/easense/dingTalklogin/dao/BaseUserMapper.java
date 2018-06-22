package com.easense.dingTalklogin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.easense.dingTalklogin.bean.BaseUser;
@Mapper
public interface BaseUserMapper {
    int deleteByPrimaryKey(Long userid);

    int insert(BaseUser record);

    int insertSelective(BaseUser record);

    BaseUser selectByPrimaryKey(Long userid);

    int updateByPrimaryKeySelective(BaseUser record);

    int updateByPrimaryKey(BaseUser record);
    
    /**
     * 查询全部
     * @return
     */
    public  List<BaseUser> selectAll();
}