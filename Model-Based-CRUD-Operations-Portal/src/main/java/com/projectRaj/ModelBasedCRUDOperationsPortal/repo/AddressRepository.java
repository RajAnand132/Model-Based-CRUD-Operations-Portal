package com.projectRaj.ModelBasedCRUDOperationsPortal.repo;

import com.projectRaj.ModelBasedCRUDOperationsPortal.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
