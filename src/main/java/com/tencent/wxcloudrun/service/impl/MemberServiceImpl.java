package com.tencent.wxcloudrun.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tencent.wxcloudrun.domain.Member;
import com.tencent.wxcloudrun.service.MemberService;
import com.tencent.wxcloudrun.dao.MemberMapper;
import org.springframework.stereotype.Service;

/**
* @author toby
* @description 针对表【members(成员表，所有进入系统的成员)】的数据库操作Service实现
* @createDate 2023-11-30 10:03:40
*/
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member>
    implements MemberService{

}




