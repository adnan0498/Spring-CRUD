package com.adnan.Spring_CRUD.service.impl;

import com.adnan.Spring_CRUD.exception.CloudVendorNotFoundException;
import com.adnan.Spring_CRUD.model.CloudVendor;
import com.adnan.Spring_CRUD.repository.CloudVendorRepository;
import com.adnan.Spring_CRUD.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {

    CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "success";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "success";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        cloudVendorRepository.deleteById(cloudVendorId);
        return "success";
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorId) {
        if (cloudVendorRepository.findById(cloudVendorId).isEmpty()) {
            throw new CloudVendorNotFoundException("Requested cloud vendor does not exist");
        }
        return cloudVendorRepository.findById(cloudVendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return cloudVendorRepository.findAll();
    }

    @Override
    public List<CloudVendor> getByVendorName(String vendorName) {
        return List.of();
    }
}
