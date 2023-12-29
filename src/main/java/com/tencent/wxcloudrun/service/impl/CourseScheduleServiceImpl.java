package com.tencent.wxcloudrun.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tencent.wxcloudrun.domain.CourseSchedule;
import com.tencent.wxcloudrun.service.CourseScheduleService;
import com.tencent.wxcloudrun.dao.CourseScheduleMapper;
import org.springframework.stereotype.Service;

/**
* @author toby
* @description 针对表【course_schedule(课程时间调度表)】的数据库操作Service实现
* @createDate 2023-11-30 10:03:40
*/
@Service
public class CourseScheduleServiceImpl extends ServiceImpl<CourseScheduleMapper, CourseSchedule>
    implements CourseScheduleService{

}




