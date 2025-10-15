package com.xuecheng.content.api;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController// 相当于controller和responsebody
@RequestMapping("/course")
public class CourseBaseInfoController {

    @RequestMapping("/list")
    public PageResult<CourseBase> list(PageParams pageParams,@RequestBody(required = false) QueryCourseParamsDto queryCourseParamsDto){
        return null;
    }
}
