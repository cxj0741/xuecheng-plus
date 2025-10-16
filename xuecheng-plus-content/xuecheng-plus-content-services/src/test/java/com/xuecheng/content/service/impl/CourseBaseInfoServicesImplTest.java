package com.xuecheng.content.service.impl;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;
import com.xuecheng.content.service.CourseBaseInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseBaseInfoServicesImplTest {

    @Autowired
    CourseBaseInfoService courseBaseInfoService;

    @Test
    void queryCourseBaseList() {

        //1. 构建controller层请求参数

        //1.1 分页参数
        PageParams pageParams = new PageParams(-1,2);

        //1.2 查询参数
        QueryCourseParamsDto queryCourseParamsDto = new QueryCourseParamsDto(null,"java",null);


        PageResult<CourseBase> courseBasePageResult = courseBaseInfoService.queryCourseBaseList(pageParams, queryCourseParamsDto);

        System.out.println(courseBasePageResult.getItems());
    }
}