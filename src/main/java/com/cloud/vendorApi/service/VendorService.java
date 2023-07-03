package com.cloud.vendorApi.service;

import java.util.List;

import com.cloud.vendorApi.Entity.Vendor;

public interface VendorService {

	public Vendor insert(Vendor vendor); 
	
	public Vendor getvendor(Integer id); 
	
	public List<Vendor> getAllvendor(); 
	
	public String delete(Integer id); 
	
	public Vendor update(Vendor vendor); 
	
		
	
}
