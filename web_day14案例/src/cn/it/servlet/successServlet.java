package cn.it.servlet;

import cn.it.domain.user;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/successServlet")
public class successServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        user user = (user) request.getAttribute("user");
        if (user!=null) {
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().write("登陆成功!" + user.getUsername() + ",欢迎您");
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         doPost(request,response);
    }
}
