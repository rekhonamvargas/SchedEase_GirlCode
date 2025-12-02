package com.appdevg5.girlcode.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.appdevg5.girlcode.entity.ScheduleEntity;
import com.appdevg5.girlcode.repository.ScheduleRepository;

@Service // contains the business logic of ur system
public class ScheduleService {

    @Autowired
    ScheduleRepository srepo;

    public ScheduleService() {
        super();
    }

    // Create (C)
    public ScheduleEntity postScheduleRecord(ScheduleEntity schedule) {
        return srepo.save(schedule);
    }

    // Read (R)
    public List<ScheduleEntity> getAllSchedules() {
        return srepo.findAll();
    }

    public ScheduleEntity updateSchedule(int schedule_id, ScheduleEntity newScheduleDetails) {
        ScheduleEntity schedule = srepo.findById(schedule_id)
            .orElseThrow(() -> new NoSuchElementException("Schedule " + schedule_id + " does not exist!"));
        
        //update the record
        schedule.setSchedule_name(newScheduleDetails.getSchedule_name());
        schedule.setIs_saved(newScheduleDetails.getIs_saved());
        
        return srepo.save(schedule);
    }

    // Delete
    //return type for delete is string bcs were jst going to print a success delete message
    public String deleteSchedule(int schedule_id) {
        String msg = "";

        if (srepo.findById(schedule_id) != null) {
            srepo.deleteById(schedule_id);
            msg = "Schedule " + schedule_id + " is successfully deleted";
        } else {
            msg = "Schedule " + schedule_id + " does not exist";
        }

        return msg;
    }
}
