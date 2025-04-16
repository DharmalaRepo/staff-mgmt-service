package com.tech.society.staff.services.impl;

import com.tech.society.staff.models.SocietyStaffTask;
import com.tech.society.staff.repositories.SocietyStaffTaskRepository;
import com.tech.society.staff.services.SocietyStaffTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SocietyStaffTaskServiceImpl implements SocietyStaffTaskService {

    @Autowired
    private SocietyStaffTaskRepository repository;

    @Override
    public SocietyStaffTask assignTask(SocietyStaffTask task) {
        return repository.save(task);
    }

    @Override
    public List<SocietyStaffTask> getTasksByStaff(String staffId) {
        return repository.findByStaffId(staffId);
    }

    @Override
    public List<SocietyStaffTask> getTasksBySociety(String societyId) {
        return repository.findBySocietyId(societyId);
    }

    @Override
    public List<SocietyStaffTask> getAllTasks() {
        return repository.findAll();
    }

    @Override
    public SocietyStaffTask updateTask(SocietyStaffTask task) {
        return repository.save(task);
    }
}