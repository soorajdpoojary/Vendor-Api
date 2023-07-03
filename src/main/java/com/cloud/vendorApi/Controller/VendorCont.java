package com.cloud.vendorApi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.vendorApi.Entity.Vendor;
import com.cloud.vendorApi.repo.Vendorepo;
import com.cloud.vendorApi.service.VendorService;

@RestController

public class VendorCont {
  
	@Autowired
	VendorService vendorService;
	
	 @PostMapping("/insert")
	private Vendor vendorata(@RequestBody Vendor vendor) {
		return vendorService.insert(vendor);
	}
	 @GetMapping("/get/{id}")
	 private Vendor getVendor(@PathVariable Integer id) {
		return vendorService.getvendor(id); 
	 }
     @PutMapping("/update")
	private Vendor updateVandor(@RequestBody Vendor vendor) {
		return vendorService.update(vendor);
	}
     @DeleteMapping("/delete/{id}")
	private String DeleteVendor(@PathVariable Integer id) {
		return vendorService.delete(id);
	}
     @GetMapping("/get/all")
     public List<Vendor> getAll() {
    	 return vendorService.getAllvendor();
     }
	
}
