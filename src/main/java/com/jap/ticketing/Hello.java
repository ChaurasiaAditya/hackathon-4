package com.jap.ticketing;
import com.jap.ticketing.model.BusTicket;
import com.jap.ticketing.service.ReadTicketData;
import java.util.List;

public class Hello {

    public static void main(String[] args) {

        // create an object for Read ticket class
        ReadTicketData readTicketData = new ReadTicketData();

        // Call the read ticket method and store in an Array List
        List<BusTicket> busTicketList = readTicketData.busTicketList("src/main/resources/sample.csv");

        // Print the bus Ticket List
        System.out.println(busTicketList);
    }
}
