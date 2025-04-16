package com.tech.society.staff.services;

import com.tech.society.staff.models.SocietyStaffMaster;

import java.util.List;

public interface SocietyStaffMasterService {
    SocietyStaffMaster registerStaff(SocietyStaffMaster staff);
    List<SocietyStaffMaster> getAllStaff();
    List<SocietyStaffMaster> getStaffBySociety(String societyId);
    SocietyStaffMaster getStaffById(String id);
    SocietyStaffMaster updateStaff(SocietyStaffMaster staff);
    void deleteStaff(String id);
}