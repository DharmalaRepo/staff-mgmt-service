package com.tech.society.staff.services.impl;

import com.tech.society.staff.models.SocietyStaffMaster;
import com.tech.society.staff.repositories.SocietyStaffMasterRepository;
import com.tech.society.staff.services.SocietyStaffMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SocietyStaffMasterServiceImpl implements SocietyStaffMasterService {

    @Autowired
    private SocietyStaffMasterRepository repository;

    @Override
    public SocietyStaffMaster registerStaff(SocietyStaffMaster staff) {
        return repository.save(staff);
    }

    @Override
    public List<SocietyStaffMaster> getAllStaff() {
        return repository.findAll();
    }

    @Override
    public List<SocietyStaffMaster> getStaffBySociety(String societyId) {
        return repository.findBySocietyId(societyId);
    }

    @Override
    public SocietyStaffMaster getStaffById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public SocietyStaffMaster updateStaff(SocietyStaffMaster staff) {
        return repository.save(staff);
    }

    @Override
    public void deleteStaff(String id) {
        repository.deleteById(id);
    }
}