package com.tencent.wxcloudrun.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tencent.wxcloudrun.domain.ClassRecord;
import com.tencent.wxcloudrun.service.ClassRecordService;
import com.tencent.wxcloudrun.dao.ClassRecordMapper;
import org.springframework.stereotype.Service;

/**
* @author toby
* @description 针对表【class_records(学生上课记录)】的数据库操作Service实现
* @createDate 2023-11-30 10:03:40
*/
@Service
public class ClassRecordServiceImpl extends ServiceImpl<ClassRecordMapper, ClassRecord>
    implements ClassRecordService{

}




