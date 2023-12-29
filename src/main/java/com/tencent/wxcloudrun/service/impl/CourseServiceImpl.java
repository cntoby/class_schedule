package com.tencent.wxcloudrun.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tencent.wxcloudrun.domain.Course;
import com.tencent.wxcloudrun.service.CourseService;
import com.tencent.wxcloudrun.dao.CourseMapper;
import org.springframework.stereotype.Service;

/**
* @author toby
* @description 针对表【courses(课程设置表)】的数据库操作Service实现
* @createDate 2023-11-30 10:03:40
*/
@Service
public class CourseServiceImpl extends ServiceImpl<CourseMapper, Course>
    implements CourseService{

}




