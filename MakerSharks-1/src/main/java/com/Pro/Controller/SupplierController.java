package com.Pro.Controller ;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Pro.Service.SupplierService;
import com.Pro.entity.Supplier;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @PostMapping("/query")
    public ResponseEntity<List<Supplier>> searchSuppliers(
            @RequestParam String location,
            @RequestParam String natureOfBusiness,
            @RequestParam String manufacturingProcesses,
            @RequestParam(defaultValue = "10") int limit) {
        List<Supplier> suppliers = supplierService.searchSuppliers(location, natureOfBusiness, manufacturingProcesses);
        return ResponseEntity.ok(suppliers.subList(0, Math.min(suppliers.size(), limit)));
    }
}