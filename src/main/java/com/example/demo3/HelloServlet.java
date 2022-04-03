package com.example.demo3;

import java.io.*;
import javax.json.JsonArray;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        //Location of the resource
        String baseURI = "http://localhost:8080/demo3-1.0-SNAPSHOT/api/student/getAll";

        //Sending a GET request to read information about the list of students
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(baseURI);
        JsonArray studentList = target.request(MediaType.APPLICATION_JSON).get(JsonArray.class);

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println(studentList);
        out.println("</body></html>");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id-field"));

        System.out.println(id);
        //The target URI of the resource
        String baseURI = "http://localhost:8080/demo3-1.0-SNAPSHOT/api/student/"+id;

        //Creating a JSON object that represents the student information the client wants to add


        //Creating a Client object
        Client client = ClientBuilder.newClient();
        //Creating a WebTarget object
        WebTarget target = client.target(baseURI);
        //Finally, calling the POST method on the WebTarget object
        StudentBean studentList = target.request(MediaType.APPLICATION_JSON).get(StudentBean.class);



        PrintWriter out = response.getWriter();
        if(studentList.getId() == 0){
            out.println("not found");
        }else{
            out.println(studentList);
        }
    }

    public void destroy() {
    }
}