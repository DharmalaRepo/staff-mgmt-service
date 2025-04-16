package com.tech.society.staff.services.impl;

import com.tech.society.staff.models.SocietyStaffRating;
import com.tech.society.staff.repositories.SocietyStaffRatingRepository;
import com.tech.society.staff.services.SocietyStaffRatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SocietyStaffRatingServiceImpl implements SocietyStaffRatingService {

    @Autowired
    private SocietyStaffRatingRepository repository;

    @Override
    public SocietyStaffRating rateStaff(SocietyStaffRating rating) {
        return repository.save(rating);
    }

    @Override
    public List<SocietyStaffRating> getRatingsByStaff(String staffId) {
        return repository.findByStaffId(staffId);
    }

    @Override
    public List<SocietyStaffRating> getRatingsBySocietyAndQuarter(String societyId, String quarter, int year) {
        return repository.findBySocietyIdAndQuarterAndYear(societyId, quarter, year);
    }
}