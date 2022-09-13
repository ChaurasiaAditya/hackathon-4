package com.jap.ticketing.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketDataTest {
    TicketData ticketData;
    String fileName = "src/test/resources/sample.csv";

    @BeforeEach
    void setUp() {
        ticketData = new TicketData();
    }

    @AfterEach
    void tearDown() {
        ticketData = null;
    }

    @Test
    void busTicketList() {
    }
}