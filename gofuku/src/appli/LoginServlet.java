package appli;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import appli.PMF;
import javax.servlet.http.*;
import model.User;
import java.io.*;
import java.util.*;
import javax.jdo.*;
/**
 *
 * @author g13953ts
 */

public class LoginServlet extends HttpServlet {
   //private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
         
        HttpSession session = req.getSession();
        String userId = (String) session.getAttribute("userId");
         
             RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
             dispatcher.forward(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        //リクエストパラメタの取得
        request.setCharacterEncoding("UTF-8");
        String userId = request.getParameter("userId");
        String pass = request.getParameter("pass");

        //登録するユーザーの情報を設定
        User loginUser = new User(userId, pass);

        //セッションスコープに登録ユーザーを保存
        HttpSession session = request.getSession();
        session.setAttribute("loginUser", loginUser);

        //フォワード
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/loginOK.jsp");
        dispatcher.forward(request, response);
        //processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}