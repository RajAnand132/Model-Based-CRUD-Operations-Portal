package com.projectRaj.ModelBasedCRUDOperationsPortal.controller;

import com.projectRaj.ModelBasedCRUDOperationsPortal.models.Laptop;
import com.projectRaj.ModelBasedCRUDOperationsPortal.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopController {
    @Autowired
    private LaptopService laptopService;

    // Create a new laptop
    @PostMapping("api/laptop")
    public String createLaptop(@RequestBody Laptop laptop) {
        // Calls the service to create a new laptop
        return laptopService.createLaptop(laptop);
    }

    // Read a laptop by ID
    @GetMapping("api/laptop/{id}")
    public Object getLaptopById(@PathVariable Long id) {
        // Calls the service to retrieve a laptop by ID
        return laptopService.getLaptopById(id);
    }

    // Update a laptop
    @PutMapping("api/laptop/id/{id}/laptopDetails")
    public String updateLaptop(@PathVariable Long id, @RequestBody Laptop laptop) {
        // Calls the service to update a laptop
        return laptopService.updateLaptop(id, laptop);
    }

    // Delete a laptop by ID
    @DeleteMapping("api/laptop/id/{id}")
    public String deleteLaptopById(@PathVariable Long id) {
        // Calls the service to delete a laptop by ID
        return laptopService.deleteLaptopById(id);
    }

    // Get all laptops
    @GetMapping("api/laptops")
    public List<Laptop> getAllLaptops() {
        // Calls the service to retrieve all laptops
        return laptopService.getAllLaptops();
    }
}
