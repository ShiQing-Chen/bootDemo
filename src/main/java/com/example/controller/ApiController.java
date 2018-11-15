package com.example.controller;

import com.example.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description //TODO RESTful接口 api
 * @author ShiQing_Chen
 * @date 2018/11/13 22:10
 */

@EnableAutoConfiguration //加上后dao不会报错
@RestController
public class ApiController {

    private static final Logger logger = LoggerFactory.getLogger(ApiController.class);


    @Autowired
    StudentService studentService;
    /**
     *
     * RESTful接口
     *
     */

    /**
     * Get 1/List
     * @return
     */
    @RequestMapping(value = "/api",method = RequestMethod.GET)
    public String helloSpringBootGet(){
        logger.info(studentService.getAll().toString());
        System.out.println(studentService.getAll().toString());
        return studentService.getAll().toString();
    }

    /**
     * Update
     * @return
     */
    @RequestMapping(value = "/api",method = RequestMethod.PUT)
    public String helloSpringBootPut(){
        return "Hello SpringBootPUT!";
    }

    /**
     * Creat
     * @return
     */
    @RequestMapping(value = "/api",method = RequestMethod.POST)
    public String helloSpringBootPost(){
        return "Hello SpringBootPOST!";
    }


    /**
     * Delete
     * @return
     */
    @RequestMapping(value = "/api",method = RequestMethod.DELETE)
    public String helloSpringBootDelete(){
        return "Hello SpringBootDELETE!";
    }
}
