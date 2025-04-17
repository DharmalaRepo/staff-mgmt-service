package com.tech.society.staff.controllers;

import com.tech.society.staff.models.SocietyStaffMaster;
import com.tech.society.staff.services.SocietyStaffMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/staff")
public class SocietyStaffMasterController {

    @Autowired
    private SocietyStaffMasterService staffService;


    @GetMapping("/health")
    public ResponseEntity<?> health() {
        return ResponseEntity.ok("Hello, welcome to Society Staff Service..!!");
    }

    @PostMapping("/register")
    public SocietyStaffMaster registerStaff(@RequestBody SocietyStaffMaster staff) {
        return staffService.registerStaff(staff);
    }

    @GetMapping("/all")
    public List<SocietyStaffMaster> getAllStaff() {
        return staffService.getAllStaff();
    }

    @GetMapping("/society/{societyId}")
    public List<SocietyStaffMaster> getBySociety(@PathVariable String societyId) {
        return staffService.getStaffBySociety(societyId);
    }

    @GetMapping("/{id}")
    public SocietyStaffMaster getById(@PathVariable String id) {
        return staffService.getStaffById(id);
    }

    @PutMapping("/update")
    public SocietyStaffMaster update(@RequestBody SocietyStaffMaster staff) {
        return staffService.updateStaff(staff);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable String id) {
        staffService.deleteStaff(id);
    }
}