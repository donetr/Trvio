package com.donetr.trvio.client;

import javax.ws.rs.core.MediaType;

import net.sf.json.JSONObject;

import com.sun.jersey.api.client.*;

public class TrvioClient {
	
	public final static String URL_BASE="http://ws.trivio.com";
	
	public static void main(String[] args) {
		
		Client c = Client.create();
		
		WebResource r = c.resource(URL_BASE+"/get_latest_version");
		String response=r.accept(MediaType.APPLICATION_JSON).header("content-length", "0").
				post(String.class);
		
		System.out.println("response:"+response);
		
		JSONObject obj=JSONObject.fromObject(response);
		
		System.out.println(obj.toString());
		
	}

}
