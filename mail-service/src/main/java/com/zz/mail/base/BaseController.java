package com.zz.mail.base;

import com.zz.cloud.core.base.BaseResult;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by tao.zeng on 2018/11/4.
 */
public abstract class BaseController implements BaseResult {

    public ServletRequestAttributes getServletRequestAttributes() {
        return (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
    }

    public HttpServletRequest getRequest() {
        return getServletRequestAttributes().getRequest();
    }

    public HttpServletResponse getResponse() {
        return getServletRequestAttributes().getResponse();
    }

    public HttpSession getSession() {
        return getRequest().getSession();
    }
}
