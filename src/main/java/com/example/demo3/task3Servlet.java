package com.example.demo3;

import javax.json.Json;
import javax.json.JsonObject;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "task3Servlet", value = "/task3Servlet")
public class task3Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String choice1 = request.getParameter("tee-choice-1");
        String choice2 = request.getParameter("tee-choice-2");
        String choice3 = request.getParameter("tee-choice-3");
        JsonObject tShirtObject = Json.createObjectBuilder()
                .add("choice1",choice1.equals("None")? "Nothing": choice1  )
                .add("choice2",choice2.equals("None")? "Nothing": choice2  )
                .add("choice3",choice3.equals("None")? "Nothing": choice3  )
                .build();

        String url = "http://localhost:8080/demo3-1.0-SNAPSHOT/api/teeShirt";

        Client client = ClientBuilder.newClient();
        WebTarget webTarget = client.target(url);

        TshirtBean tShirt = webTarget.request().post(Entity.entity(tShirtObject,MediaType.APPLICATION_JSON),TshirtBean.class);
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h3>You ordered</h3>");
        out.println("<p>"+ tShirt.getChoice1()+"</p>");
        out.println("<p>"+ tShirt.getChoice2()+"</p>");
        out.println("<p>"+ tShirt.getChoice3()+"</p>");
        out.println("</body></html>");
    }
}
