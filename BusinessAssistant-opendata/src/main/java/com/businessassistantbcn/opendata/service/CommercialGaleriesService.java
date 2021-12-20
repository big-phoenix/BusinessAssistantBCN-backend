package com.businessassistantbcn.opendata.service;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.businessassistantbcn.opendata.dto.commercialgaleries.CommercialGaleriesResponseDto;
import com.businessassistantbcn.opendata.dto.commercialgaleries.CommercialGaleriesResultDto;
import com.businessassistantbcn.opendata.dto.test.StarWarsVehiclesResultDto;
import com.businessassistantbcn.opendata.helper.HttpClientHelper;

import io.swagger.v3.oas.models.media.MediaType;
import reactor.core.publisher.Mono;



@Service
public class CommercialGaleriesService {
	
	@Autowired
    HttpClientHelper helper;
	
	String url = "http://www.bcn.cat/tercerlloc/files/mercats-centrescomercials/opendatabcn_mercats-centrescomercials_galeries-comercials-js.json";
	//String url = "https://api.github.com";
	
	public CommercialGaleriesResponseDto getCommercialGaleriesAll()
	{
		
		/*RestTemplate restTemplate = new RestTemplate();
		CommercialGaleriesResultDto response = restTemplate.getForObject(url, CommercialGaleriesResultDto.class);
		*/
		
		RestTemplate restTemplate = new RestTemplate();
		CommercialGaleriesResponseDto response = restTemplate.getForObject(url, CommercialGaleriesResponseDto.class);
		
		//JSONArray jsonArrayCommercialGalerie = new JSONArray(response);
		//JSONObject jsonObjectCommercialGaleries = new JSONObject();
		
		
    	/*WebClient.Builder webClient = WebClient.builder();
		
    	CommercialGaleriesResponseDto galeria = webClient.build()
								    				.get()
								    				.uri(url)
								    				.retrieve()
								    				.bodyToMono(CommercialGaleriesResponseDto.class)
								    				.block();*/
    	
		
		//jsonObjectCommercialGaleries.put("elements", jsonArrayCommercialGalerie);
		System.out.println(response);
		return response;
	}
	
	/*public <T> Mono<T> getTestData(){
        return helper.getCommercialGaleriesRequest(CommercialGaleriesResultDto.class);
    }
	
	/*String url = "http://www.bcn.cat/tercerlloc/files/mercats-centrescomercials/opendatabcn_mercats-centrescomercials_galeries-comercials-js.json";
	
	public JSONObject getCommercialGaleriesAll()
	{
		RestTemplate restTemplate = new RestTemplate();
		String response = restTemplate.getForObject(url, String.class);
		JSONArray jObj = new JSONArray(response);
		
		JSONObject jsonObjectCommercialGaleries = new JSONObject();
		JSONArray jsonArrayCommercialGalerie = new JSONArray();
    	
    	long id=0;
    	String name="";
    	String register_date="";
    	String district_id="";
    	String district_name="";
    	int neighborhood_id=0;
    	String neighborhood_name="";
    	String address_name="";
    	int start_street_number=0;
    	String zip_code="";
    	String town="";
    	String province="";
    	
    	for (int i = 0; i < jObj.length(); i++) {
    	    try {
    	        JSONObject jsonObject = jObj.getJSONObject(i);
    	        JSONArray jsonArrayElements = jsonObject.getJSONArray("addresses");
    	        JSONObject jsonObjectAddresse = jsonArrayElements.getJSONObject(0);
    	        
    	        JSONObject jsonObjectElements = new JSONObject();
    	        
    	        if (jsonObject.has("register_id")) {
    	            id 					= jsonObject.getLong("register_id");
    	            name 				= jsonObject.getString("name");
    	            register_date 		= jsonObject.getString("created");
    	            district_id 		= jsonObjectAddresse.getString("district_id");
    	            district_name 		= jsonObjectAddresse.getString("district_name");
    	            neighborhood_id 	= jsonObjectAddresse.getInt("neighborhood_id");
    	            neighborhood_name 	= jsonObjectAddresse.getString("neighborhood_name");
    	            address_name 		= jsonObjectAddresse.getString("address_name");
    	        	start_street_number = jsonObjectAddresse.getInt("start_street_number");
    	        	zip_code 			= jsonObjectAddresse.getString("zip_code");
    	        	town 				= jsonObjectAddresse.getString("town");
    	        	province 			= jsonObjectAddresse.getString("province");
    	           
    	           
    	        }
    	        
    	        
    	        jsonObjectElements.put("id", id);
    			jsonObjectElements.put("name", name);
    			jsonObjectElements.put("register_date", register_date);
    			jsonObjectElements.put("district_id", district_id);
    			jsonObjectElements.put("district_name", district_name);
    			jsonObjectElements.put("neighborhood_id", neighborhood_id);
    			jsonObjectElements.put("neighborhood_name", neighborhood_name);
    			jsonObjectElements.put("address_name", address_name);
    			jsonObjectElements.put("start_street_number", start_street_number);
    			jsonObjectElements.put("zip_code", zip_code);
    			jsonObjectElements.put("town", town);
    			jsonObjectElements.put("province", province);
    			
    			
    			jsonArrayCommercialGalerie.put(jsonObjectElements);
    			
    	        
    	    } catch (JSONException e) {
    	        e.printStackTrace();
    	    }
    	}
    	
    	jsonObjectCommercialGaleries.put("count", jObj.length());
    	jsonObjectCommercialGaleries.put("elements", jsonArrayCommercialGalerie);
		
		return jsonObjectCommercialGaleries;
	}*/
	
	

}
