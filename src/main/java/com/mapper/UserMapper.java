package com.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.domain.User;

@Mapper
public interface UserMapper {
	
	@Select("select * from t_user where phone = #{phone}")
	User findUserByPhone(@Param("phone") String phone);
	
	@Insert("insert into t_user(name,password,phone)values(#{name},#{password},#{phone})")
	int insert(@Param("name") String name, @Param("password") String password, @Param("phone")String phone);
}
