package com.projectRaj.ModelBasedCRUDOperationsPortal.service;

import com.projectRaj.ModelBasedCRUDOperationsPortal.models.Laptop;
import com.projectRaj.ModelBasedCRUDOperationsPortal.repo.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LaptopService {
    @Autowired
    private LaptopRepository laptopRepository;

    // Create a new laptop
    public String createLaptop(Laptop laptop) {
        laptopRepository.save(laptop);
        return "New laptop : "+laptop.getName()+" addded into repository";
    }

    // Read a laptop by ID
    public Object getLaptopById(Long id) {
        Optional<Laptop> optionalLaptop = laptopRepository.findById(id);
        if(optionalLaptop.isPresent()){
            return optionalLaptop;
        }
        return "Laptop with id :"+id+" not available";
    }

    // Update a laptop
    public String updateLaptop(Long id ,Laptop laptop) {
        Optional<Laptop> optionalLaptop = laptopRepository.findById(id);
        if(optionalLaptop.isPresent()){
            laptopRepository.save(laptop);
            return "Laptop with id :"+id+" updated";
        }
        return "Laptop with id :"+id+" not available to update";
    }

    // Delete a laptop by ID
    public String deleteLaptopById(Long id) {
        Optional<Laptop> optionalLaptop = laptopRepository.findById(id);
        if(optionalLaptop.isPresent()){
            laptopRepository.deleteById(id);
            return "Laptop with id :"+id+" deleted";
        }
        return "Laptop with id :"+id+" not available";
    }

    // Get all laptops
    public List<Laptop> getAllLaptops() {
        return laptopRepository.findAll();
    }

    // Custom methods for Laptop-related operations
}
