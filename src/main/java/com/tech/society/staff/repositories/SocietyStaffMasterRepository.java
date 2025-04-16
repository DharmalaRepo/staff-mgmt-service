package com.tech.society.staff.repositories;

import com.tech.society.staff.models.SocietyStaffMaster;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface SocietyStaffMasterRepository extends MongoRepository<SocietyStaffMaster, String> {
    List<SocietyStaffMaster> findBySocietyId(String societyId);
    List<SocietyStaffMaster> findByDepartment(String department);

    List<SocietyStaffMaster> findByIsActive(int isActive);
}