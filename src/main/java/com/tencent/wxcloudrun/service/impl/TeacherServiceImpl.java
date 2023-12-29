package com.tencent.wxcloudrun.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tencent.wxcloudrun.domain.Teacher;
import com.tencent.wxcloudrun.service.TeacherService;
import com.tencent.wxcloudrun.dao.TeacherMapper;
import org.springframework.stereotype.Service;

/**
* @author toby
* @description 针对表【teachers(老师表)】的数据库操作Service实现
* @createDate 2023-11-30 10:03:40
*/
@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher>
    implements TeacherService{

}




