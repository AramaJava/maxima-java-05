package org.example;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/cat")
public class CatServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String catName = request.getParameter("catName");
        int catWeight= Integer.parseInt(request.getParameter("catWeight"));
        boolean catIsAngry = Boolean.parseBoolean(request.getParameter("catIsAngry"));

        response.setContentType("text/html; charset=UTF-8");
        PrintWriter writer = response.getWriter();

        //на занятии сказали делать через стригбилдер

        StringBuilder sb = new StringBuilder("<h1>Информация о коте:</h1><br>");

        sb.append("<h2>Имя кота: ").append(catName).append("</h2><br>")
                .append("<h2>Вес кота: ").append(catWeight).append("</h2><br>")
                .append("<h2>Сердитость: ").append(catIsAngry).append("</h2>");

        writer.write(sb.toString());
        writer.close();
        //строка проверки в браузере:
        //http://localhost:8080/mywebapp/cat?catName=Murzik&catWeight=5&catIsAngry=true
    }
}
