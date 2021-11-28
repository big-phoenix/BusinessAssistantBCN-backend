package com.businessassistantbcn.opendata.dto.commercialgaleries;

import org.springframework.stereotype.Component;

@Component
//@JsonRootName(value = "elements")
public class CommercialGaleriesRespondeDto {
	
	//private long count;
	
	private long register_id=0;
	private String name="";
	private String register_date="";
	private String district_id="";
	private String district_name="";
	private int neighborhood_id=0;
	private String neighborhood_name="";
	private String address_name="";
	private int start_street_number=0;
	private String zip_code="";
	private String town="";
	private String province="";
	
	
	public long getRegister_id() {
		return register_id;
	}
	public void setRegister_id(long register_id) {
		this.register_id = register_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegister_date() {
		return register_date;
	}
	public void setRegister_date(String register_date) {
		this.register_date = register_date;
	}
	public String getDistrict_id() {
		return district_id;
	}
	public void setDistrict_id(String district_id) {
		this.district_id = district_id;
	}
	public String getDistrict_name() {
		return district_name;
	}
	public void setDistrict_name(String district_name) {
		this.district_name = district_name;
	}
	public int getNeighborhood_id() {
		return neighborhood_id;
	}
	public void setNeighborhood_id(int neighborhood_id) {
		this.neighborhood_id = neighborhood_id;
	}
	public String getNeighborhood_name() {
		return neighborhood_name;
	}
	public void setNeighborhood_name(String neighborhood_name) {
		this.neighborhood_name = neighborhood_name;
	}
	public String getAddress_name() {
		return address_name;
	}
	public void setAddress_name(String address_name) {
		this.address_name = address_name;
	}
	public int getStart_street_number() {
		return start_street_number;
	}
	public void setStart_street_number(int start_street_number) {
		this.start_street_number = start_street_number;
	}
	public String getZip_code() {
		return zip_code;
	}
	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	
	
    
	
}
