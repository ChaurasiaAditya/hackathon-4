package com.jap.ticketing;

import com.jap.ticketing.service.BusTicketService;
import com.jap.ticketing.service.ReadTicketData;
import org.junit.jupiter.api.BeforeEach;



public class HelloTest {
    ReadTicketData readTicketData;
    BusTicketService busTicketService;
    String fileName = "src/test/resources/sample.csv";

    @BeforeEach
    public void setUp(){
        readTicketData = new ReadTicketData();
        busTicketService = new BusTicketService();
    }
}