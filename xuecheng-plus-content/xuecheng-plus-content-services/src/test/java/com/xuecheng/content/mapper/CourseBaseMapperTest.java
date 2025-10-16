package com.xuecheng.content.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;
import org.apache.logging.log4j.core.util.Assert;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseBaseMapperTest {

    @Autowired
    CourseBaseMapper courseBaseMapper;

    @Test
    public void testCourseBaseMapper(){
        CourseBase courseBase = courseBaseMapper.selectById(1);

        Assert.isNonEmpty(courseBase);
    }

    @Test
    public void testSelectPage(){

        //1. 构建controller层请求参数

        //1.1 分页参数
        PageParams pageParams = new PageParams(0,2);

        //1.2 查询参数
        QueryCourseParamsDto queryCourseParamsDto = new QueryCourseParamsDto("202004","java","1");

        //2. 使用mybatisplus进行查询

        //2.1 构建查询条件
        LambdaQueryWrapper<CourseBase> queryWrapper = new LambdaQueryWrapper();
        queryWrapper.like(StringUtils.isNotBlank(queryCourseParamsDto.getCourseName()), CourseBase::getName, queryCourseParamsDto.getCourseName());
//        queryWrapper.eq(StringUtils.isNotBlank(queryCourseParamsDto.getAuditStatus()), CourseBase::getAuditStatus, queryCourseParamsDto.getAuditStatus());
//        queryWrapper.eq(StringUtils.isNotBlank(queryCourseParamsDto.getPublishStatus()), CourseBase::getStatus, queryCourseParamsDto.getPublishStatus());

        //2.2 构建分页参数
        Page<CourseBase> page = new Page<>(pageParams.getPageNo(),pageParams.getPageSize());

        //2.2 进行查询
        Page<CourseBase> courseBasePage = courseBaseMapper.selectPage(page, queryWrapper);

        //items,count,page,pagesize
        List<CourseBase> items = courseBasePage.getRecords();
        long total = courseBasePage.getTotal();

        //3. 构建返回参数
        PageResult<CourseBase> pageResult = new PageResult<>(items, total, pageParams.getPageNo(), pageParams.getPageSize());
    }

}