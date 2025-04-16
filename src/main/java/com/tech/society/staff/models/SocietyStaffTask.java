package com.tech.society.staff.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "society_staff_task")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SocietyStaffTask {
    @Id
    private String id;
    private int customId;
    private String staffId;
    private String taskTitle;
    private String description;
    private LocalDateTime assignedDate;
    private String status; // e.g., "Pending", "Completed"
    private String societyId;
    private String createdBy;
    private LocalDateTime createdDate;
    private String modifiedBy;
    private LocalDateTime modifiedDate;
    private int isActive;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCustomId() {
        return customId;
    }

    public void setCustomId(int customId) {
        this.customId = customId;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getAssignedDate() {
        return assignedDate;
    }

    public void setAssignedDate(LocalDateTime assignedDate) {
        this.assignedDate = assignedDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSocietyId() {
        return societyId;
    }

    public void setSocietyId(String societyId) {
        this.societyId = societyId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public LocalDateTime getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(LocalDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public int getIsActive() {
        return isActive;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }
}