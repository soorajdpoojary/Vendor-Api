package com.cloud.vendorApi.vendorService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloud.vendorApi.Entity.Vendor;
import com.cloud.vendorApi.repo.Vendorepo;
import com.cloud.vendorApi.service.VendorService;

@Service
public class vendorServiceimpl implements VendorService {
	
	@Autowired
	private Vendorepo vendorepo;

	@Override
	public Vendor insert(Vendor vendor) {
		return vendorepo.save(vendor);
	}

	@Override
	public Vendor getvendor(Integer id) {
		return vendorepo.findById(id).get();
	}

	@Override
	public List<Vendor> getAllvendor() {
		return vendorepo.findAll();
	}

	@Override
	public String delete(Integer id) {
		 vendorepo.deleteById(id);
		 return "data is deleted";
	}

	@Override
	public Vendor update(Vendor vendor) {
		return vendorepo.save(vendor);
	}

}
