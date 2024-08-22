package com.Pro.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Pro.entity.Supplier;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
    
	@Query("SELECT s FROM Supplier s WHERE s.location = :location AND s.natureofbusiness = :natureofbusiness AND s.manufacturingProcesses LIKE %:manufacturingProcesses%")
	List<Supplier> findSuppliers(@Param("location") String location, @Param("natureofbusiness") String natureofbusiness, @Param("manufacturingProcesses") String manufacturingProcesses);


}