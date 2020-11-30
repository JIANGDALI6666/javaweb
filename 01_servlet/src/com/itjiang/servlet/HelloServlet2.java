package com.itjiang.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClaassName: HelloServlet2
 * @Author: jiangdali
 * @Date: 2020/11/28
 * @Description:
 * @Version 1.0
 */
public class HelloServlet2 extends HttpServlet {
    //可自动判定get请求和post请求
    //根据业务需要重写get,post方法
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("得到了get请求");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("得到了post请求");
    }
}
