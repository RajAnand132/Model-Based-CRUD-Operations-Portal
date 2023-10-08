package com.projectRaj.ModelBasedCRUDOperationsPortal.controller;

import com.projectRaj.ModelBasedCRUDOperationsPortal.models.Address;
import com.projectRaj.ModelBasedCRUDOperationsPortal.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    private AddressService addressService;

    @PostMapping("api/address")
    public String createAddress(@RequestBody Address address) {
        // Calls the service to create a new address
        return addressService.createAddress(address);
    }

    // Read a address by ID
    @GetMapping("api/address/{id}")
    public Object getAddressById(@PathVariable Long id) {
        // Calls the service to retrieve a address by ID
        return addressService.getAddressById(id);
    }

    // Update a address
    @PutMapping("api/address/id/{id}/addressDetails")
    public String updateaddress(@PathVariable Long id, @RequestBody Address address) {
        // Calls the service to update a address
        return addressService.updateAddress(id, address);
    }

    // Delete a address by ID
    @DeleteMapping("api/address/id/{id}")
    public String deleteaddressById(@PathVariable Long id) {
        // Calls the service to delete a address by ID
        return addressService.deleteAddressById(id);
    }

    // Get all addresss
    @GetMapping("api/addresss")
    public List<Address> getAlladdresss() {
        // Calls the service to retrieve all addresss
        return addressService.getAllAddresses();
    }
}
