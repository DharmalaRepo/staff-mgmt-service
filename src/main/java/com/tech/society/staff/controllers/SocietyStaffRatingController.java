package com.tech.society.staff.controllers;

import com.tech.society.staff.models.SocietyStaffRating;
import com.tech.society.staff.services.SocietyStaffRatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/staff/ratings")
public class SocietyStaffRatingController {

    @Autowired
    private SocietyStaffRatingService ratingService;

    @PostMapping("/add")
    public SocietyStaffRating rate(@RequestBody SocietyStaffRating rating) {
        return ratingService.rateStaff(rating);
    }

    @GetMapping("/staff/{staffId}")
    public List<SocietyStaffRating> getByStaff(@PathVariable String staffId) {
        return ratingService.getRatingsByStaff(staffId);
    }

    @GetMapping("/society/{societyId}/quarter/{quarter}/year/{year}")
    public List<SocietyStaffRating> getByQuarter(
            @PathVariable String societyId,
            @PathVariable String quarter,
            @PathVariable int year) {
        return ratingService.getRatingsBySocietyAndQuarter(societyId, quarter, year);
    }
}