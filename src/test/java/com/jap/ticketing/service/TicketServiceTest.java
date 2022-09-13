package com.jap.ticketing.service;

import com.jap.ticketing.model.BusTicket;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;


class TicketServiceTest {
    TicketService ticketService;
    TicketData ticketData;
    String fileName = "src/test/resources/sample.csv";

    @BeforeEach
    void setUp() {
        ticketData = new TicketData();
        ticketService = new TicketService();
    }

    @AfterEach
    void tearDown() {
        ticketData = null;
        ticketService = null;
    }

    @Test
    public void givenBusTicketListReturnSortedListByDistanceTravelledSuccess() {
        List<BusTicket> busTicketList = ticketData.busTicketList(fileName);
        Assertions.assertEquals(49.5, ticketService.getAllTicketDetailSortedByDistanceTravelled(busTicketList).get(0).getTravelledKM(), "List is Not Sorted");
    }

    @Test
    public void givenBusTicketListReturnSortedListByDistanceTravelledFailure() {
        List<BusTicket> busTicketList = ticketData.busTicketList(fileName);
        Assertions.assertNotEquals(45.3, ticketService.getAllTicketDetailSortedByDistanceTravelled(busTicketList).get(0).getTravelledKM(), "List is Not Sorted");
    }

    @Test
    public void givenBusTicketListReturnTotalAMountCollectedFromTicketsSuccess() {
        List<BusTicket> busTicketList = ticketData.busTicketList(fileName);
        Assertions.assertEquals(10348.0, ticketService.totalCollectionsMadeFromSales(busTicketList));
    }

    @Test
    public void givenBusTicketListReturnTotalAMountCollectedFromTicketsFailure() {
        List<BusTicket> busTicketList = ticketData.busTicketList(fileName);
        Assertions.assertNotEquals(12350.0, ticketService.totalCollectionsMadeFromSales(busTicketList));
    }
}