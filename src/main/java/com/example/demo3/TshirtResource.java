package com.example.demo3;

import javax.ejb.Stateful;
import javax.json.JsonObject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/teeShirt")
@Stateful
public class TshirtResource {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public TshirtBean addTeeShirt(JsonObject jsonObject)
    {
        TshirtBean tShirt = new TshirtBean();
        tShirt.setChoice1(jsonObject.getString("choice1"));
        tShirt.setChoice2(jsonObject.getString("choice2"));
        tShirt.setChoice3(jsonObject.getString("choice3"));
        System.out.println(tShirt);
        return tShirt;
    }
}