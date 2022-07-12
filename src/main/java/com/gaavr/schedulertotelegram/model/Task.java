package com.gaavr.schedulertotelegram.model;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class Task {

    private String name = "";
    private String description = "";
    private TaskPriority taskPriority = TaskPriority.NOT_TAKEN;
    private TaskStatus taskStatus = TaskStatus.LOW;
    private LocalTime timeForTask = LocalTime.of(1, 30);
    private LocalDateTime plannedStartTime = null;
    private LocalDateTime plannedEndTime = null;
    private LocalDateTime factStartTime = null;
    private LocalDateTime factEndTime = null;
}
