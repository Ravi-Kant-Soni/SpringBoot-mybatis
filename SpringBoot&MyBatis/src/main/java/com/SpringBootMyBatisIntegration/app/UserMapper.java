package com.SpringBootMyBatisIntegration.app;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface UserMapper {
	
	@Select("select * from USERSDTO where USER_ID=1")
    UsersDTO findByState();

}
