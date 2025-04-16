package com.tech.society.staff.services;

import com.tech.society.staff.models.SocietyStaffTask;

import java.util.List;

public interface SocietyStaffTaskService {
    SocietyStaffTask assignTask(SocietyStaffTask task);
    List<SocietyStaffTask> getTasksByStaff(String staffId);
    List<SocietyStaffTask> getTasksBySociety(String societyId);
    List<SocietyStaffTask> getAllTasks();
    SocietyStaffTask updateTask(SocietyStaffTask task);
}