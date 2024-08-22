package com.Pro.Service ;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Pro.Repository.SupplierRepository;
import com.Pro.entity.Supplier;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    public List<Supplier> searchSuppliers(String location, String natureOfBusiness, String manufacturingProcesses) {
        return supplierRepository.findSuppliers(
                location, natureOfBusiness, manufacturingProcesses);
    }
}