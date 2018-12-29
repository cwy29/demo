package com.example.demojishi.dao;

import com.example.demojishi.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao {
    @Insert("insert into user (username,userpwd)values(#{username},#{userpwd})")
    public Integer reg(@Param("username")String username,@Param("userpwd")String userpwd);
    @Select("select * from user where username=#{username}and userpwd=#{userpwd}")
    public User login(@Param("username")String username,@Param("userpwd")String userpwd);
}
