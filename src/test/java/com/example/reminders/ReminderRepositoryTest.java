package com.example.reminders;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ReminderRepositoryTest {

    @Autowired
    private ReminderRepository reminders;

    @Test
    void savesAndListsReminders() {
        reminders.save("call mom");

        assertThat(reminders.findAll()).hasSize(1);
        assertThat(reminders.findAll().get(0).message()).isEqualTo("call mom");
    }
}
