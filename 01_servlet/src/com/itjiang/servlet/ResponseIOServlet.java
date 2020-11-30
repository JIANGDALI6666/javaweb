package com.itjiang.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @ClaassName: ${NAME}
 * @Author: jiangdali
 * @Date: 2020/11/29
 * @Description: 向浏览器返回信息有两种流，一种是字节流，一种是字符流，但是只能同时使用一种。
 * @Version 1.0
 */
public class ResponseIOServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //向浏览器返回一个字符串
        //设置服务器字符集，默认是ISO-8859-1
        System.out.println(response.getCharacterEncoding());
        /*response.setCharacterEncoding("UTF-8");

        //通过响应头，设置浏览器也使用UTF-8字符集
        response.setHeader("Content-Type","text/html;charset=UTF-8");*/

        //第二种方法，它会同时设置服务器和客户端都使用UTF-8字符集，还设置了响应头
        //此方法一定要在获取流对象之前调用才有效
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter printWriter = response.getWriter();
        printWriter.write("向浏览器返回一个字符串");
    }
}
