package com.hay.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @title: UserFilter
 * @Author HuangYan
 * @Date: 2020/7/14 14:51
 * @Version 1.0
 */
@Component
public class UserFilter extends ZuulFilter {
    /**
     * 过滤器的类型：
     *      pre(路由前) routing(路由时) post(路由后) error(错误)
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 过滤器的执行级别
     * @return
     */
    @Override
    public int filterOrder() {
        return 10;
    }

    /**
     * 是否开启此过滤器
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        // 获取Zuul的上下文对象
        RequestContext context = RequestContext.getCurrentContext();
        // 获取Request请求对象
        HttpServletRequest request = context.getRequest();

        String token = request.getParameter("token");
        // 如果没有token
        if (StringUtils.isBlank(token)){
            // 不转发请求
            context.setSendZuulResponse(false);
            // 设置状态码401 表示未认证
            context.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
            // 设置响应，打印字符串
            context.setResponseBody("request error 401!");
        }
        return null;
    }
}
