package com.itjiang.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClaassName: ${NAME}
 * @Author: jiangdali
 * @Date: 2020/11/29
 * @Description: 接收来自forwordServleet的请求转发
 * @Version 1.0
 */
public class ForwardServlet2 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String str = request.getParameter("username");
        Object str2 = request.getAttribute("username");
        System.out.println(str);
        System.out.println(str2);
    }
}
