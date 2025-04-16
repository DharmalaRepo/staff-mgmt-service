package com.tech.society.staff.services;

import com.tech.society.staff.models.SocietyStaffRating;

import java.util.List;

public interface SocietyStaffRatingService {
    SocietyStaffRating rateStaff(SocietyStaffRating rating);
    List<SocietyStaffRating> getRatingsByStaff(String staffId);
    List<SocietyStaffRating> getRatingsBySocietyAndQuarter(String societyId, String quarter, int year);
}