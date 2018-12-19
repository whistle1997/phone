package com.wsl.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public interface MobileService {
	@GET
	@Path("/get/{nuwnum}")
	@Produces({MediaType.APPLICATION_JSON})
	public String getOneByMobileNumber(@PathParam("nuwnum")String nuwnum);

	public void test1();
}
