package com.fx;

import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CityMapper {
    public City selectById(int id);
    @Select("select * from city where id = #{id}")
    public City selectById2(int id);
    public List<City> selectAll();
    public void insertOne(String name);
}
