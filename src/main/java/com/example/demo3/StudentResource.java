package com.example.demo3;


import javax.json.JsonObject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.*;

@Path("/student")
public class StudentResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public StudentBean getStudents(@PathParam("id") int id)
    {
        System.out.println(id);
        StudentBean student1 = new StudentBean(1,"Abir","4th",3f,1234404);
        StudentBean student2 = new StudentBean(2,"Bakar","5th", 3.4f, 123456);
        StudentBean student3 = new StudentBean(3,"Bashar","6th", 3.5f, 32049);
        StudentBean student4 = new StudentBean(4,"Yeasin","4th", 3.8f, 395032);
        StudentBean student5 = new StudentBean(5,"Sajid","7th", 3.9f, 4503920);
        ArrayList<StudentBean> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        StudentBean studentBean = new StudentBean();
        for(int i=0;i<studentList.size();i++)
        {
            if(studentList.get(i).getId() == id)
            {
                studentBean= studentList.get(i);
                break;
            }

        }
        return studentBean;

    }

    @GET
    @Path("/getAll")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<StudentBean> getALl()
    {
        StudentBean student1 = new StudentBean(1,"Abir","4th",3f,1234404);
        StudentBean student2 = new StudentBean(2,"Bakar","5th", 3.4f, 123456);
        StudentBean student3 = new StudentBean(3,"Bashar","6th", 3.5f, 32049);
        StudentBean student4 = new StudentBean(4,"Yeasin","4th", 3.8f, 395032);
        StudentBean student5 = new StudentBean(5,"Sajid","7th", 3.9f, 4503920);
        ArrayList<StudentBean> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        return studentList;
    }
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/getHighCG")
    public ArrayList<StudentBean> getHighCG(@QueryParam("id1") int id1, @QueryParam("id2") int id2 )
    {
        StudentBean student1 = new StudentBean(1,"Abir","4th",3f,1234404);
        StudentBean student2 = new StudentBean(2,"Bakar","5th", 3.4f, 123456);
        StudentBean student3 = new StudentBean(3,"Bashar","6th", 3.5f, 32049);
        StudentBean student4 = new StudentBean(4,"Yeasin","4th", 3.8f, 395032);
        StudentBean student5 = new StudentBean(5,"Sajid","7th", 3.9f, 4503920);
        ArrayList<StudentBean> studentList = new ArrayList<>();
        ArrayList<StudentBean> highCGList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        if(studentList.isEmpty())
        {
            studentList.add(student1);
        }

        id1 -=1;
        id2 -=1;
        StudentBean student = new StudentBean();
        if(studentList.get(id1).getCgpa() >= studentList.get(id2).getCgpa())
        {
            student = studentList.get(id1);
        }
        else
        {
            student = studentList.get(id2);
        }

        if(!highCGList.contains(student))
        {
            highCGList.add(student);
        }
        System.out.println(highCGList.size());
        return (ArrayList<StudentBean>) highCGList;

    }

}
