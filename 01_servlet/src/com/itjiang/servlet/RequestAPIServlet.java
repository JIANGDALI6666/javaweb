package com.itjiang.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

/**
 * @ClaassName: ${NAME}
 * @Author: jiangdali
 * @Date: 2020/11/29
 * @Description: 讲解RequestServlet
 *
 * @Version 1.0
 */

public class RequestAPIServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置请求体的字符集为UTF-8,从而解决post请求的中文乱码问题，
        //切记要在第一次获取请求参数之前调用才生效
        request.setCharacterEncoding("UTF-8");
        System.out.println("前端传来的用户名："+request.getParameter("username"));
        System.out.println("前端传来的密码："+request.getParameter("password"));
        //当页面属性name作为键有多个值的时候，用getParameterValues
        String[] hobby = request.getParameterValues("hobby");
        System.out.println(Arrays.asList(hobby));
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("请求的URI:"+ request.getRequestURI());
        System.out.println("请求的URL："+request.getRequestURL());
        System.out.println("客户端ip地址："+request.getRemoteHost()+",端口："+request.getRemotePort());
        System.out.println("请求头User-Agent："+request.getHeader("User-Agent"));
        System.out.println("请求的方式:"+request.getMethod());
        System.out.println("前端传来的用户名："+request.getParameter("username"));
        System.out.println("前端传来的密码："+request.getParameter("password"));
        //当页面属性name作为键有多个值的时候，用getParameterValues
        String[] hobby = request.getParameterValues("hobby");
        System.out.println(Arrays.asList(hobby));
    }
}
