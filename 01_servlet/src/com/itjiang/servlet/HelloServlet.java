package com.itjiang.servlet;

import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @ClaassName: HelloServlet
 * @Author: jiangdali
 * @Date: 2020/11/28
 * @Description:
 * @Version 1.0
 */

/**
 * 直接实现servlet很少，一般都是使用继承HttpServlet类的方式去实现servlet。可看例二
 */
public class HelloServlet implements Servlet {

    public HelloServlet() {
        //单例的，第一次访问时才会执行
        System.out.println("1,构造器方法");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("2,init初始化方法");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * servlet方法专门用来处理请求和响应的
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("3，hello,servlet被访问了");
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        String method = httpServletRequest.getMethod();
        if("GET".equals(method)){
            doGet();
        }else if("POST".equals(method)) {
            doPost();
        }
    }

    public void doGet(){
        System.out.println("接下来执行get请求的业务");
    }
    public void doPost(){
        System.out.println("接下来执行post执行的业务");
    }
    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("4,销毁方法");
    }
}
