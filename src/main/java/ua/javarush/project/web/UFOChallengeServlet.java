package ua.javarush.project.web;

import ua.javarush.project.answers.CreatorOfGames;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/challengePage")
public class UFOChallengeServlet extends HttpServlet {


private CreatorOfGames creatorOfGames = new CreatorOfGames();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String value = req.getParameter("value");
        creatorOfGames.createGame(value);
        resp.setStatus(200);
    }
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         req.getRequestDispatcher("challengePage.jsp").forward(req, resp);
     }

}
