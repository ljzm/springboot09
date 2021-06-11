package cn.kgc.springboot09.interceptor;


import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * 日志拦截器
 */
@Component
public class LogInterceptor implements HandlerInterceptor {


    /**
     * 在handler方法执行前执行的代码
     * @param request
     * @param response
     * @param handler 对应的处理器
     * @return true 继续执行handler 方法  false 停止执行handler方法
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println(handler);
        System.out.println(request.getRemoteAddr()+" 发送了请求,当前系统时间为：" + new Date());
        return true;
    }

    /**
     * handler方法执行结束后执行的代码
     * @param request
     * @param response
     * @param handler 对应的处理器
     * @param modelAndView handler返回的视图名和模型
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("请求执行完毕,当前系统时间为：" + new Date());
    }

    /**
     * 视图渲染结束后执行的方法，如果在该方法中操作模型数据， 对于最终视图不产生任何影响
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println(" 渲染成功！当前系统时间为： " + new Date());
    }
}
