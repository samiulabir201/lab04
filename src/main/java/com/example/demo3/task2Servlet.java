package com.example.demo3;

import javax.ejb.EJB;
import javax.json.JsonArray;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "task2Servlet", value = "/task2Servlet")
public class task2Servlet extends HttpServlet {
    private String message2;

    public void init() {
        message2 = "Hello World!";
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message2 + "</h1>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id1 = Integer.parseInt(request.getParameter("id1"));
        int id2 = Integer.parseInt(request.getParameter("id2"));
        PrintWriter out = response.getWriter();
        //out.println(id1);
        //out.println(id2);

        String url =  "http://localhost:8080/demo3-1.0-SNAPSHOT/api/student/getHighCG?id1="+id1+"&id2="+id2;

        Client client = ClientBuilder.newClient();
        WebTarget webTarget = client.target(url);
        JsonArray student = webTarget.request(MediaType.APPLICATION_JSON).get(JsonArray.class);
        response.setContentType("text/html");

        out.println("<html><body>");

        System.out.println(student);
        for(int i =0;i<student.size();i++)
        {

            out.println("<h3> " + student.get(i)  + "</h4>");
            out.println("</br>");
        }

        out.println("</body></html>");


    }
}
