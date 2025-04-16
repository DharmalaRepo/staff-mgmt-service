package com.tech.society.staff.controllers;

import com.tech.society.staff.services.SocietyStaffRatingAggregatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/staff/ratings/aggregate")
public class RatingAggregatorController {

    @Autowired
    private SocietyStaffRatingAggregatorService aggregatorService;

    @PostMapping("/update-master")
    public ResponseEntity<String> updateRatingsInMaster() {
        aggregatorService.aggregateAndUpdateRatings();
        return ResponseEntity.ok("Staff ratings aggregated and updated successfully.");
    }
}
