package com.tencent.wxcloudrun.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tencent.wxcloudrun.domain.ClassCourse;
import com.tencent.wxcloudrun.service.ClassCourseService;
import com.tencent.wxcloudrun.dao.ClassCourseMapper;
import org.springframework.stereotype.Service;

/**
* @author toby
* @description 针对表【class_courses(学生参加的课程及交费情况)】的数据库操作Service实现
* @createDate 2023-11-30 10:03:40
*/
@Service
public class ClassCourseServiceImpl extends ServiceImpl<ClassCourseMapper, ClassCourse>
    implements ClassCourseService{

}




