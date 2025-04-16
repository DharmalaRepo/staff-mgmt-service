package com.tech.society.staff.controllers;

import com.tech.society.staff.models.SocietyStaffAttendance;
import com.tech.society.staff.services.SocietyStaffAttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/staff/attendance")
public class SocietyStaffAttendanceController {

    @Autowired
    private SocietyStaffAttendanceService attendanceService;

    @PostMapping("/mark")
    public SocietyStaffAttendance mark(@RequestBody SocietyStaffAttendance attendance) {
        return attendanceService.markAttendance(attendance);
    }

    @GetMapping("/staff/{staffId}/date/{date}")
    public List<SocietyStaffAttendance> getByStaffAndDate(
            @PathVariable String staffId, @PathVariable String date) {
        return attendanceService.getAttendanceByDate(staffId, LocalDate.parse(date));
    }

    @GetMapping("/society/{societyId}/date/{date}")
    public List<SocietyStaffAttendance> getBySocietyAndDate(
            @PathVariable String societyId, @PathVariable String date) {
        return attendanceService.getAttendanceBySociety(societyId, LocalDate.parse(date));
    }
}