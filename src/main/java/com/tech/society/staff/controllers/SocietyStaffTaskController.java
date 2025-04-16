package com.tech.society.staff.controllers;

import com.tech.society.staff.models.SocietyStaffTask;
import com.tech.society.staff.services.SocietyStaffTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/staff/tasks")
public class SocietyStaffTaskController {

    @Autowired
    private SocietyStaffTaskService taskService;

    @PostMapping("/assign")
    public SocietyStaffTask assignTask(@RequestBody SocietyStaffTask task) {
        return taskService.assignTask(task);
    }

    @GetMapping("/staff/{staffId}")
    public List<SocietyStaffTask> getByStaff(@PathVariable String staffId) {
        return taskService.getTasksByStaff(staffId);
    }

    @GetMapping("/society/{societyId}")
    public List<SocietyStaffTask> getBySociety(@PathVariable String societyId) {
        return taskService.getTasksBySociety(societyId);
    }

    @GetMapping("/all")
    public List<SocietyStaffTask> getAll() {
        return taskService.getAllTasks();
    }

    @PutMapping("/update")
    public SocietyStaffTask update(@RequestBody SocietyStaffTask task) {
        return taskService.updateTask(task);
    }
}