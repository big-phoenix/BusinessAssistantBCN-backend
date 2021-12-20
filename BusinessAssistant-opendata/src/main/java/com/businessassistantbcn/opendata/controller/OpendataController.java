package com.businessassistantbcn.opendata.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.businessassistantbcn.opendata.dto.commercialgaleries.CommercialGaleriesResponseDto;
import com.businessassistantbcn.opendata.dto.commercialgaleries.CommercialGaleriesResultDto;
import com.businessassistantbcn.opendata.helper.HttpClientHelper;
import com.businessassistantbcn.opendata.service.CommercialGaleriesService;
import com.businessassistantbcn.opendata.service.TestService;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;

import org.json.JSONObject;

import io.swagger.annotations.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping(value = "/v1/api/opendata")
public class OpendataController {


    @Autowired
    TestService testService;
    
    @Autowired
    HttpClientHelper helper;
    
    @Autowired
	CommercialGaleriesService commercialGaleriesService;
	
	@Autowired
	private ObjectMapper objectMapper;
	
	

    @GetMapping(value="/test")
    @ApiOperation("Get test")
    @ApiResponse(code = 200, message = "OK")
    public String test(){
        return "Hello from BusinessAssistant Barcelona!!!";
    }

    //reactive
    @GetMapping(value="/test-reactive")
    @ApiOperation("Get test")
    @ApiResponse(code = 200, message = "OK")
    public <T> Mono<T> testReactive(){
        return testService.getTestData();
    }


    //GET ?offset=0&limit=10
    @GetMapping("/large-establishments")
    @ApiOperation("Get large establishments SET 0 LIMIT 10")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Not Found"),
    })
    public String largeEstablishments()
    {
        return "large-establishments";
    }

    //GET ?offset=0&limit=10
    @GetMapping("/commercial-galeries")
    @ApiOperation("Get commercial galeries SET 0 LIMIT 10")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Not Found"),
    })

    /*public ResponseEntity<Object> commercialGaleries()
    {
    	//return testService.getTestData();
    	
    	
    	JSONObject jsonObject = commercialGaleries.getCommercialGaleriesAll();
    	
    	//String json = jsonObject.toString();
    	
    	//List<CommercialGaleriesRespondeDto> listcommercialGaleriesDTO = objectMapper.readValue(json, new TypeReference<List<CommercialGaleriesRespondeDto>>(){});

        return new ResponseEntity<>(jsonObject.toMap(), HttpStatus.OK);
        
    }*/
    
    public CommercialGaleriesResponseDto commercialGaleries()
    {
    	
    	return commercialGaleriesService.getCommercialGaleriesAll();
    	//return commercialGaleriesService.getTestData();
        
    }
    
    //GET ?offset=0&limit=10
    @GetMapping("/big-malls")
    @ApiOperation("Get big malls SET 0 LIMIT 10")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Not Found"),
    })
    public String bigMalls()
    {
        return "big-malls";
    }

    //GET ?offset=0&limit=10
    @GetMapping("/municipal-markets")
    @ApiOperation("Get municipal markets SET 0 LIMIT 10")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Not Found"),
    })
    public String municipalMarkets()
    {
        return "municipal-markets";
    }

    //GET ?offset=0&limit=10
    @GetMapping("/markets-fairs")
    @ApiOperation("Get markets fairs SET 0 LIMIT 10")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Not Found"),
    })
    public String marketsFairs()
    {
        return "markets-fairs";
    }


}
