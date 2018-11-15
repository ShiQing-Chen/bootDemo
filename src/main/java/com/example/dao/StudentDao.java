package com.example.dao;

import com.example.model.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author ShiQing_Chen
 * @Description //TODO
 * @date 2018/11/14 20:31
 */

@Mapper
public interface StudentDao {

    public List<Student> getAll();
}
