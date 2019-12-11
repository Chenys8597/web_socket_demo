package com.zr.web_socket_demo.rest;

import com.zr.web_socket_demo.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@CrossOrigin
@Component
@Path("/kafka")
public class KafkaResource extends BaseResource{

    @Autowired
    private KafkaService kafkaService;

    @POST
    @Path("/massage")
    public boolean sendMassage(@QueryParam("key") Integer key, @QueryParam("value") String value) throws Exception {

        kafkaService.sendMassage(key, value);

        return true;
    }
}
