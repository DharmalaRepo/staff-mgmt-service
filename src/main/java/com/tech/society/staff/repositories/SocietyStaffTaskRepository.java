package com.tech.society.staff.repositories;

import com.tech.society.staff.models.SocietyStaffTask;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface SocietyStaffTaskRepository extends MongoRepository<SocietyStaffTask, String> {
    List<SocietyStaffTask> findByStaffId(String staffId);
    List<SocietyStaffTask> findBySocietyId(String societyId);
    List<SocietyStaffTask> findByStatus(String status);
}