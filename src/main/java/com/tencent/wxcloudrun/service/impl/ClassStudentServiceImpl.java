package com.tencent.wxcloudrun.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tencent.wxcloudrun.domain.ClassStudent;
import com.tencent.wxcloudrun.service.ClassStudentService;
import com.tencent.wxcloudrun.dao.ClassStudentMapper;
import org.springframework.stereotype.Service;

/**
* @author toby
* @description 针对表【class_students(学生表)】的数据库操作Service实现
* @createDate 2023-11-30 10:03:40
*/
@Service
public class ClassStudentServiceImpl extends ServiceImpl<ClassStudentMapper, ClassStudent>
    implements ClassStudentService{

}




