package com.itjiang.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.temporal.ValueRange;

/**
 * @ClaassName: ${NAME}
 * @Author: jiangdali
 * @Date: 2020/11/28
 * @Description:
 * @Version 1.0
 */
public class ContextServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /**
         * ServletContext:一个接口，表示Servlet上下文环境，一个web工程只有一个ServletContext对象实例。各个servlt之间可以互相使用，在web工程部署的时候创建，web工程停止的时候销毁。
         * 作用：
         * 1.可以获取web.xml中配置文件的上下文参数context-param
         * 2.获取当前工程路径
         * 3.获取部署在服务器硬盘上的绝对路径
         * 4.一个域对象，可以像map一样存储数据
         */

        ServletContext servletContext = getServletContext();
        System.out.println("context-param参数username的值是"+servletContext.getInitParameter("username"));
        System.out.println("当前工程路径："+servletContext.getContextPath());
        System.out.println("工程部署的路径:"+servletContext.getRealPath("/"));
        servletContext.setAttribute("key1","value1");
        System.out.println(servletContext.getAttribute("key1"));
    }
}
