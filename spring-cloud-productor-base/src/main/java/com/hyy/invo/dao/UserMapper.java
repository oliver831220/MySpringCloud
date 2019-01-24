package com.hyy.invo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hyy.invo.domain.User;

@Mapper
public interface UserMapper {

	int insert(User record);
 
    List getUser();
}
