package com.example.reminders;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ReminderRepository {

    private final JdbcTemplate jdbc;

    public ReminderRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(String message) {
        jdbc.update("insert into reminder (message) values (?)", message);
    }

    public List<Reminder> findAll() {
        return jdbc.query("select id, message from reminder",
                (row, number) -> new Reminder(row.getLong("id"), row.getString("message")));
    }
}
