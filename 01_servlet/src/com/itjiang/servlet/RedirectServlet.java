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
 * @Description:  重定向：由浏览器再次请求，地址栏有变化，不共享request域中的数据，无法访问WEB-INF下的资源
 * @Version 1.0
 */
public class RedirectServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("此链接已失效");
        /*第一种方案
        //设置相应吗状态是302，表示重定向
        response.setStatus(302);
        //设置响应头，告诉浏览器新的地址在哪里
        response.setHeader("Location","http://localhost:8080/01_servlet/response");*/
        //无法访问WEB-INF下的资源
        //response.setHeader("Location","http://localhost:8080/01_servlet/WEB-INF/form.html");
        /**
         * 简单的第二种方案
         */
        response.sendRedirect("http://localhost:8080/01_servlet/WEB-INF/form.html");
    }
}