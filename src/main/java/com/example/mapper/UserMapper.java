package com.example.mapper;

import com.example.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from user")
    List<User> findAll();

    @Insert("insert into user values(#{id},#{name},#{age})")
    void add(User user);
    @Delete("delete from user where id=#{id}")
    void del(int id);
}
