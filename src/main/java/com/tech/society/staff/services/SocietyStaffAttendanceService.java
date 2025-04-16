package com.tech.society.staff.services;

import com.tech.society.staff.models.SocietyStaffAttendance;

import java.time.LocalDate;
import java.util.List;

public interface SocietyStaffAttendanceService {
    SocietyStaffAttendance markAttendance(SocietyStaffAttendance attendance);
    List<SocietyStaffAttendance> getAttendanceByDate(String staffId, LocalDate date);
    List<SocietyStaffAttendance> getAttendanceBySociety(String societyId, LocalDate date);
}