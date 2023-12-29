package com.tencent.wxcloudrun.intercepter;

import com.tencent.wxcloudrun.dto.Result;
import com.tencent.wxcloudrun.holder.LocalUserHolder;
import com.tencent.wxcloudrun.model.UserSession;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
@Component
public class UserInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        UserSession userSession = new UserSession(request);
        if (StringUtils.isEmpty(userSession.getAppId()) || StringUtils.isEmpty(userSession.getOpenId())) {
            response.setHeader("content-type", "application/json");
            response.getWriter().print(Result.fail("permission denied"));
            return false;
        }
        LocalUserHolder.set(userSession);
        return HandlerInterceptor.super.preHandle(request, response, handler);
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
