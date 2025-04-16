package com.tech.society.staff.services.impl;

import com.tech.society.staff.models.SocietyStaffMaster;
import com.tech.society.staff.models.SocietyStaffRating;
import com.tech.society.staff.repositories.SocietyStaffMasterRepository;
import com.tech.society.staff.repositories.SocietyStaffRatingRepository;
import com.tech.society.staff.services.SocietyStaffRatingAggregatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.DoubleSummaryStatistics;
import java.util.List;

@Service
public class SocietyStaffRatingAggregatorServiceImpl implements SocietyStaffRatingAggregatorService {

    @Autowired
    private SocietyStaffMasterRepository staffRepo;

    @Autowired
    private SocietyStaffRatingRepository ratingRepo;

    @Override
    public void aggregateAndUpdateRatings() {
        List<SocietyStaffMaster> activeStaff = staffRepo.findByIsActive(1);

        for (SocietyStaffMaster staff : activeStaff) {
            List<SocietyStaffRating> ratings = ratingRepo.findByStaffId(String.valueOf(staff.getCustomId()));

            if (!ratings.isEmpty()) {
                DoubleSummaryStatistics stats = ratings.stream()
                        .mapToDouble(SocietyStaffRating::getRating)
                        .summaryStatistics();

                double avgRating = stats.getAverage();
                staff.setRating(avgRating);
                staffRepo.save(staff);
            }
        }
    }
}