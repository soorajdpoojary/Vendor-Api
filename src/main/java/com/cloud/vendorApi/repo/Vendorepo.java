package com.cloud.vendorApi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cloud.vendorApi.Entity.Vendor;
@Repository
public interface Vendorepo extends JpaRepository<Vendor, Integer> {

}
