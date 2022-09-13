package com.jap.ticketing;

import com.jap.ticketing.model.BusTicket;
import com.jap.ticketing.service.BusTicketService;
import com.jap.ticketing.service.ReadTicketData;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;


public class HelloTest {
    ReadTicketData readTicketData;
    BusTicketService busTicketService;
    String fileName = "src/test/resources/sample.csv";

    @BeforeEach
    public void setUp(){
        readTicketData = new ReadTicketData();
        busTicketService = new BusTicketService();
    }

    @AfterEach
    public void tearDown(){
        readTicketData = null;
        busTicketService = null;
    }

    @Test
    public void givenBusTicketDataFileReturnTheNUmberOfListPresentInFile(){
    List<BusTicket> output = readTicketData.busTicketList(fileName);
    Assertions.assertEquals(49,output.size());
    }

    public void givenBusTicketListReturnSortedListByDistanceTravelled(){

    }
}