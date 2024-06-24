package com.adnan.Spring_CRUD.controller;

import com.adnan.Spring_CRUD.model.CloudVendor;
import com.adnan.Spring_CRUD.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {

    CloudVendorService cloudVendorService;

    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId) {
        return cloudVendorService.getCloudVendor(vendorId);
    }

    @GetMapping()
    public List<CloudVendor> getAllCloudVendorDetails() {
        return cloudVendorService.getAllCloudVendors();
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendorService.createCloudVendor(cloudVendor);
        return "Cloud vendor created successfully";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendorService.updateCloudVendor(cloudVendor);
        return "Cloud vendor updated successfully";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId) {
        this.cloudVendorService.deleteCloudVendor(vendorId);
        return "Cloud vendor deleted successfully";
    }
}
