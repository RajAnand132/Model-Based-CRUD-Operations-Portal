package com.projectRaj.ModelBasedCRUDOperationsPortal.service;

import com.projectRaj.ModelBasedCRUDOperationsPortal.models.Address;
import com.projectRaj.ModelBasedCRUDOperationsPortal.repo.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    private AddressRepository addressRepository;

    // Create a new address
    public String createAddress(Address address) {
        addressRepository.save(address);
        return "New address added into the repository";
    }

    // Read an address by ID
    public Object getAddressById(Long id) {
        Optional<Address> optionalAddress = addressRepository.findById(id);
        if(optionalAddress.isPresent()){
           return optionalAddress;
        }
        return "Address with id :"+id+" not available";
    }

    // Update an address
    public String updateAddress(Long id, Address address) {
        Optional<Address> optionalBook = addressRepository.findById(id);
        if(optionalBook.isPresent()){
            addressRepository.save(address);
            return "Address with id :"+id+" updated";
        }
        return "Address with id :"+id+" not available to update";
    }

    // Delete an address by ID
    public String deleteAddressById(Long id) {
        Optional<Address> optionalBook = addressRepository.findById(id);
        if(optionalBook.isPresent()){
            addressRepository.deleteById(id);
            return "Address with id :"+id+" deleted";
        }
        return "Address with id :"+id+" not available";
    }

    // Get all addresses
    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }

}