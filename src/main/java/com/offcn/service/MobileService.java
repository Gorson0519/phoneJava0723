package com.offcn.service;

import com.offcn.bean.Mobile;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public interface MobileService {

    @GET
    @Path("/get/{mobileNumber}")
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public Mobile getMobile(@PathParam("mobileNumber") String mobileNumber);
}
