package com.truonghan.rest.inventory;

import java.io.IOException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Component;

import com.truonghan.backend.model.Part;
import com.truonghan.backend.service.PartService;

@Component
@Path(value="/v1/inventory/")
public class v1_inventory {

	@Autowired
	PartService service;
	
	@Path("/test")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String test(){
		return "<p>Test</p>";
	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response returnAllPCPart(){
		Response rp = null;
		String rs ="";
		List<Part> parts = service.findAll();
		 
	    ObjectMapper mapper = new ObjectMapper();
	 
	 try {
		rs =   mapper.writeValueAsString(parts);
		rp = Response.ok(rs.toString()).build();
	} catch (JsonGenerationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (JsonMappingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return rp;
	}
}
