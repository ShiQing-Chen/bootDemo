package com.example.service.Impl;

import com.example.dao.StudentDao;
import com.example.model.Student;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ShiQing_Chen
 * @Description //TODO
 * @date 2018/11/14 20:33
 */

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> getAll() {
        return studentDao.getAll();
    }
}
