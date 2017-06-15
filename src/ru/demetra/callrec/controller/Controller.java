package ru.demetra.callrec.controller;


import ru.demetra.callrec.dao.CallDao;
import ru.demetra.callrec.model.Call;
import ru.demetra.callrec.util.Factory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * Base controller
 *
 * @author Vyacheslav Y.
 * @version 1.0
 *
 */

public class Controller extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String login = req.getParameter("login");
        String password = req.getParameter("password");

        HttpSession session = req.getSession();

        session.setAttribute("login", login);


        String msg = "Не правильный логин/пароль";

        if (login.equals("6801") && password.equals("6801")) {

            Factory factory = Factory.getInstance();
            CallDao callDao = factory.getCallDao();

            List<Call> calls = callDao.listCallsDemetra();

            req.setAttribute("calls", calls);
            resp.setContentType("text/html; charset=utf-8");
            req.getRequestDispatcher("calls.jsp").forward(req, resp);

        } else if (login.equals("7007") && password.equals("7007")) {

            Factory factory = Factory.getInstance();
            CallDao callDao = factory.getCallDao();

            List<Call> calls = callDao.listCallsTrapeza();

            req.setAttribute("calls", calls);
            resp.setContentType("text/html; charset=utf-8");
            req.getRequestDispatcher("calls.jsp").forward(req, resp);

        } else resp.setContentType("text/html; charset=utf-8");
        req.setAttribute("msg", msg);
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }




    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String login = req.getParameter("login");
        String password = req.getParameter("password");

        String msg = "Не правильный логин/пароль";

        if (login.equals("6801") && password.equals("6801")) {

            Factory factory = Factory.getInstance();
            CallDao callDao = factory.getCallDao();

            List<Call> calls = callDao.listCallsDemetra();

            req.setAttribute("calls", calls);
            resp.setContentType("text/html; charset=utf-8");
            req.getRequestDispatcher("calls.jsp").forward(req, resp);

        } else if (login.equals("7007") && password.equals("7007")){

            Factory factory = Factory.getInstance();
            CallDao callDao = factory.getCallDao();

            List<Call> calls = callDao.listCallsTrapeza();

            req.setAttribute("calls", calls);
            resp.setContentType("text/html; charset=utf-8");
            req.getRequestDispatcher("calls.jsp").forward(req, resp);

        } else resp.setContentType("text/html; charset=utf-8");
        req.setAttribute("msg", msg);
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}


