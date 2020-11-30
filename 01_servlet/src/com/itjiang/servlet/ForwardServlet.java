package com.itjiang.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClaassName: ${NAME}
 * @Author: jiangdali
 * @Date: 2020/11/29
 * @Description: 转发：再在服务器内部转发，地址栏无变化，无法访问工程外资源
 * @Version 1.0
 */
public class ForwardServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /**
         * getParameter:获取浏览器请求时的参数
         * getAttribute:相当于一个map，可以存取数据，和getParameter不一回事，不是同一个空间，并不相互影响。
         */
        String username = request.getParameter("username");
        System.out.println(username);
        String newUsername = "刘"+username;
        request.setAttribute("username",newUsername);
        //RequestDispatcher：请求调度器接口
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/forward2");
        //转发
        requestDispatcher.forward(request,response);
    }
}
