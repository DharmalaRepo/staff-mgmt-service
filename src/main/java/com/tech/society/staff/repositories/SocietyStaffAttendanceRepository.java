package com.tech.society.staff.repositories;

import com.tech.society.staff.models.SocietyStaffAttendance;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDate;
import java.util.List;

public interface SocietyStaffAttendanceRepository extends MongoRepository<SocietyStaffAttendance, String> {
    List<SocietyStaffAttendance> findByStaffIdAndDate(String staffId, LocalDate date);
    List<SocietyStaffAttendance> findBySocietyIdAndDate(String societyId, LocalDate date);
}