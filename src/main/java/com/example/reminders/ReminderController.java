package com.example.reminders;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reminders")
public class ReminderController {

    private final ReminderRepository reminders;

    public ReminderController(ReminderRepository reminders) {
        this.reminders = reminders;
    }

    @PostMapping
    public void save(@RequestParam String message) {
        reminders.save(message);
    }

    @GetMapping
    public List<Reminder> list() {
        return reminders.findAll();
    }
}
