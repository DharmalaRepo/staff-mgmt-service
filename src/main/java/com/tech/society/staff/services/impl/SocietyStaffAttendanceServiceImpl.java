package com.tech.society.staff.services.impl;

import com.tech.society.staff.models.SocietyStaffAttendance;
import com.tech.society.staff.repositories.SocietyStaffAttendanceRepository;
import com.tech.society.staff.services.SocietyStaffAttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class SocietyStaffAttendanceServiceImpl implements SocietyStaffAttendanceService {

    @Autowired
    private SocietyStaffAttendanceRepository repository;

    @Override
    public SocietyStaffAttendance markAttendance(SocietyStaffAttendance attendance) {
        return repository.save(attendance);
    }

    @Override
    public List<SocietyStaffAttendance> getAttendanceByDate(String staffId, LocalDate date) {
        return repository.findByStaffIdAndDate(staffId, date);
    }

    @Override
    public List<SocietyStaffAttendance> getAttendanceBySociety(String societyId, LocalDate date) {
        return repository.findBySocietyIdAndDate(societyId, date);
    }
}