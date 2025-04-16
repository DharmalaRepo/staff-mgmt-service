package com.tech.society.staff.repositories;

import com.tech.society.staff.models.SocietyStaffRating;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface SocietyStaffRatingRepository extends MongoRepository<SocietyStaffRating, String> {
    List<SocietyStaffRating> findByStaffId(String staffId);
    List<SocietyStaffRating> findByResidentId(String residentId);
    List<SocietyStaffRating> findBySocietyIdAndQuarterAndYear(String societyId, String quarter, int year);
}