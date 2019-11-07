package com.cyl.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author : Liu
 * @Date : 2019/11/7 下午 03:16
 * @Description :
 */

public class ThreeInterceptor extends InterceptorAdapter{
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        return false;
    }
}
