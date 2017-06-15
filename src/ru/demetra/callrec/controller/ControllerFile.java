package ru.demetra.callrec.controller;

import ru.demetra.callrec.util.CallFile;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Controller for {@link CallFile} request
 *
 * @author Vyacheslav Y.
 * @version 1.0
 */

public class ControllerFile extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String path = req.getParameter("path");
        String dir = "/var/spool/asterisk/monitor/";
        String prefix = "/sound/";
        String file = null;

        CallFile callFile = new CallFile();

        try {
            file = callFile.pathSelector(dir, path, prefix);
            req.setAttribute("file", file);
            resp.setContentType("text/html; charset=utf-8");
            req.getRequestDispatcher("file.jsp").forward(req, resp);
        } catch (Exception e) {
            e.printStackTrace();
            req.setAttribute("file", path);
            resp.setContentType("text/html; charset=utf-8");
            req.getRequestDispatcher("error.jsp").forward(req, resp);

        }
    }
}
