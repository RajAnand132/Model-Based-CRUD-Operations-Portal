package com.projectRaj.ModelBasedCRUDOperationsPortal.repo;

import com.projectRaj.ModelBasedCRUDOperationsPortal.models.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepository extends JpaRepository<Laptop, Long> {
}
