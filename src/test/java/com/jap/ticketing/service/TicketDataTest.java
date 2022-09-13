package com.jap.ticketing.service;

import com.jap.ticketing.model.BusTicket;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

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
    public void givenBusTicketDataFileReturnTheNUmberOfListPresentInFile() {
        List<BusTicket> busTicketList = ticketData.busTicketList(fileName);
        Assertions.assertEquals(49, busTicketList.size(), "Error in reading file correctly");
    }
    @Test
    public void givenBusTicketDataFileReturnTheNUmberOfListPresentInFileFailure() {
        List<BusTicket> busTicketList = ticketData.busTicketList(fileName);
        Assertions.assertNotEquals(50, busTicketList.size(), "Error in reading file correctly");
    }
}