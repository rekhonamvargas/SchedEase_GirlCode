package com.appdevg5.girlcode.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "schedule")
public class ScheduleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int schedule_id;

    // Relationship: Many schedules belong to one user
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user; // Use an actual UserEntity reference instead of int user_id

    private String schedule_name;

    // These are generated or derived later based on filters, not manually set by users
    private String view_days;
    private String time_range;

    private boolean is_saved;

    public ScheduleEntity() {
        super();
    }

    public ScheduleEntity(int schedule_id, UserEntity user, String schedule_name, String view_days, String time_range, boolean is_saved) {
        super();
        this.schedule_id = schedule_id;
        this.user = user;
        this.schedule_name = schedule_name;
        this.view_days = view_days;
        this.time_range = time_range;
        this.is_saved = is_saved;
    }

    public int getSchedule_id() {
        return schedule_id;
    }

    public void setSchedule_id(int schedule_id) {
        this.schedule_id = schedule_id;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public String getSchedule_name() {
        return schedule_name;
    }

    public void setSchedule_name(String schedule_name) {
        this.schedule_name = schedule_name;
    }

    public String getView_days() {
        return view_days;
    }

    public void setView_days(String view_days) {
        this.view_days = view_days;
    }

    public String getTime_range() {
        return time_range;
    }

    public void setTime_range(String time_range) {
        this.time_range = time_range;
    }

    public boolean getIs_saved() {
        return is_saved;
    }

    public void setIs_saved(boolean is_saved) {
        this.is_saved = is_saved;
    }
}